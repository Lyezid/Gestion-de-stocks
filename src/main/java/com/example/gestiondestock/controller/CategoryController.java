package com.example.gestiondestock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestiondestock.service.CategoryService;

@RestController
@RequestMapping

public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    
}