package com.marcof.produits.controllers;

import java.net.http.HttpClient.Redirect;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marcof.produits.entities.Produit;
import com.marcof.produits.repos.ProduitRepository;
import com.marcof.produits.services.ProduitService;

@Controller
public class ProduitController {
	@Autowired
	ProduitService produitService;
	
	@RequestMapping("/ListeProduits")
	public String listeProduits(ModelMap modelMap) {
		List<Produit> produits = produitService.getAllProduits();
		modelMap.addAttribute("produits", produits);
		System.out.println("produits : ");
		System.out.println(produits);
		return "listeProduits";
	}
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createProduit";
	}
	
	@RequestMapping("/showProduit")
	public String showProduit(Long id, ModelMap modelMap){
		Produit produit = produitService.getProduit(id);
		modelMap.addAttribute("produit", produit);
		return "showProduit";
	}
	
	@RequestMapping("/modifierProduit")
	public String modifierProduit(Long id, ModelMap modelMap) {
		Produit produit = produitService.getProduit(id);
		modelMap.addAttribute("produit", produit);
		return "modifProduit";
	}
	
	@RequestMapping("updateProduit")
	public String updateProduit(@ModelAttribute("produit") Produit produit, 
								@RequestParam("date") String date,
								ModelMap modelMap) throws ParseException
	{	
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateCreation = dateFormat.parse(String.valueOf(date));
		produit.setDateCreation(dateCreation);
		produitService.updateProduit(produit);
		List<Produit> produits = produitService.getAllProduits();
		modelMap.addAttribute("produits", produits);
		return "listeProduits";
		
	}
	
	@RequestMapping("/supprimerProduit")
	public String supprimerProduit(@RequestParam("id") Long id, ModelMap modelMap) {
		produitService.deleteProduitById(id);
		List<Produit> produits = produitService.getAllProduits();
		modelMap.addAttribute("produits", produits);
		return "listeProduits";
	}
	
	@RequestMapping("/saveProduit")
	public String saveProduit(@ModelAttribute("produit") Produit produit, 
							  @RequestParam("date") String date, 
							  ModelMap modelMap) throws ParseException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
		Date dateCreation = dateFormat.parse(String.valueOf(date));
		produit.setDateCreation(dateCreation);
		Produit saveProduit = produitService.saveProduit(produit);
		String msg = "produit enregistré avec l'Id " + saveProduit.getIdProduit();
		modelMap.addAttribute("msg", msg);
		return "createProduit";
	}
}
