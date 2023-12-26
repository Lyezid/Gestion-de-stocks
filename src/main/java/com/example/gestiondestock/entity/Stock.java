package com.example.gestiondestock.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Stock {
    
    @Id
    private Long stockID;
    private int quanty;

    @ManyToMany(mappedBy = "stocks", cascade = CascadeType.ALL)
    private List<Utilisateur> user;

    @ManyToMany(mappedBy = "stocks", cascade = CascadeType.ALL)
    private List<Produit> Produit;
    
}