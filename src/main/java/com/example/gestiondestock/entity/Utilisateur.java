package com.example.gestiondestock.entity;


import com.example.gestiondestock.Enum.en_user_type;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Utilisateur 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;    
    private String prenom;
    private String email;
    private Long nni;
    private en_user_type type;

    @ManyToMany
    @JoinTable(
        name = "utilisateur-produit",
        joinColumns = @JoinColumn(name = "Utilisateur"),
        inverseJoinColumns = @JoinColumn(name = "idProd")
    )
    private List<Produit> produit; 
}