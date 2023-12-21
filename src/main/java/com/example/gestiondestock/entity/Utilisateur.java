package com.example.gestiondestock.entity;

import org.springframework.stereotype.Indexed;

import com.example.gestiondestock.Enum.en_user_type;
import com.example.gestiondestock.entity.Stock;


import jakarta.persistence.Column;
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
    @JoinColumn(name = "stockId")
    private Stock  stock;
}