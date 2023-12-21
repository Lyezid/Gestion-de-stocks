package com.example.gestiondestock.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.gestiondestock.entity.Produit;
import com.example.gestiondestock.service.ProduitService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/produit")
public class ProduitController {
    @Autowired
    private ProduitService produitService;


    @GetMapping("/All-produit")
    public ResponseEntity<List<Produit>>getAllProduit(){
        return ResponseEntity.status(HttpStatus.OK).body(produitService.findAllProduit());
    }

    @GetMapping("get-produit/{produit-id}")
     public ResponseEntity<Optional<Produit>> getProduit(@PathVariable("produit-id") Long produitId){
        return ResponseEntity.status(HttpStatus.OK).body(produitService.findProduit(produitId));
    }
    
    
    @PostMapping("/Add-produit")
    public void createProduit(@RequestBody Produit produit){
        ResponseEntity.status((HttpStatus.CREATED)).body(produitService.createProduit(produit));
    }
    
    @DeleteMapping(path = "/Delete/{Produit-id}")
    public void deleteProduit(@PathVariable("Produit-id") Long produitId){
        produitService.deleteProduit(produitId);
    }
   
    @PutMapping("/Update/{Produit-id}")
    public ResponseEntity<Optional<Produit>> upateUtilisateur(@PathVariable("Produit-id") Long produitId, @RequestBody Produit updateProduit){
        return ResponseEntity.status(HttpStatus.OK)
        .body(produitService.updateProduit(produitId, updateProduit));
    }
}