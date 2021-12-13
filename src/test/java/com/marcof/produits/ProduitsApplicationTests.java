package com.marcof.produits;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.marcof.produits.entities.Produit;
import com.marcof.produits.repos.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Test
	void testCreateProduit() {
		Produit prod = new Produit("PC ALIENWARE", 2500.500, new Date());
		produitRepository.save(prod);
	}
	@Test
	public void testFindProduit() {
		Produit p = produitRepository.findById(1L).get();
		System.out.println(p);
	}
	
	/*@Test
	public void testFindAllProduits() {
		List<Produit> produits = 
	}
	*/
}
