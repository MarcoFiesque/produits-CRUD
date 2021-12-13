package com.marcof.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcof.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
