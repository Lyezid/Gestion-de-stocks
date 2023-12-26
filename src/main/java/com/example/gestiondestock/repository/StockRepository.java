package com.example.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestiondestock.entity.Stock;

public interface StockRepository extends JpaRepository<Stock, Long>{
    
}