package com.example.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gestiondestock.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{

    
}