package com.example.gestiondestock.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Stock {
    // stok : idus , idprod ,quanti;
    @Id
    private Long stockID;
    private int quanty;

    @ManyToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private List<Utilisateur> Utilisateur;

    @ManyToMany(mappedBy = "idProd", cascade = CascadeType.ALL)
    private List<Produit> Produit;
    
}