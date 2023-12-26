package com.example.gestiondestock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestiondestock.entity.Produit;
import com.example.gestiondestock.repository.ProduitRpository;

@Service
public class ProduitService {

    @Autowired
    private ProduitRpository produitRpository;

        public List<Produit> findAllProduit(){
        return produitRpository.findAll();
    }

    public Optional<Produit> findProduit(Long produitId){
        return produitRpository.findById(produitId);
    }

    public Produit createProduit(Produit produit){
        return produitRpository.save(produit);
    }
    
    public void deleteProduit(Long produitId){
        produitRpository.deleteById(produitId);
    }

    public Optional<Produit> updateProduit(Long produitId, Produit updateProduit){
        return produitRpository.findById(produitId).map(
                                        prod -> {
                                            prod.setNomProd(updateProduit.getNomProd());
                                            prod.setQuantityProd(updateProduit.getQuantityProd());
                                            prod.setPrix(updateProduit.getPrix());
                                            prod.setCategory(updateProduit.getCategory());

                                            return produitRpository.save(prod);
                                        }
                                        );
    }
}