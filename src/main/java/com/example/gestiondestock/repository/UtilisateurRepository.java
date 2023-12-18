package com.example.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gestiondestock.entity.Utilisateur;
// osk
// shift alt
@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{
    
}