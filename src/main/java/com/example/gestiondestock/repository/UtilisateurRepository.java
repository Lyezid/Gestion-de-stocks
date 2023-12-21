package com.example.gestiondestock.repository;
import com.example.gestiondestock.entity.Utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{
    
}