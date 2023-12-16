package com.example.gestiondestock.entity;

import org.springframework.stereotype.Indexed;

import com.example.gestiondestock.Enum.en_user_type;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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


}