package com.example.gestiondestock.dto;

import com.example.gestiondestock.entity.Utilisateur;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UtilisateurDto {
    private int usersCount;
    private List<Utilisateur> user;
}