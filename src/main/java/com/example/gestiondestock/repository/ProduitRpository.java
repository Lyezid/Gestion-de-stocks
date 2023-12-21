package com.example.gestiondestock.repository;

import com.example.gestiondestock.entity.Produit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// keycklock
// mvn reository

@Repository
public interface ProduitRpository extends JpaRepository<Produit, Long> {

}