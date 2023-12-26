package com.example.gestiondestock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestiondestock.repository.StockRepository;

@Service
public class StockService {
    
    @Autowired
    private StockRepository stockRepository;



    

}