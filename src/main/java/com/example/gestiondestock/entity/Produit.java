package com.example.gestiondestock.entity;

// import com.example.gestiondestock.entity.Utilisateur;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produit {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProd;
    private String nomProd;
    private int quantityProd;
    private float prix;


    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Category category;

    @ManyToMany(mappedBy = "produit")
    private List<Utilisateur> user;
}