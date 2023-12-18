package com.example.gestiondestock.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.gestiondestock.service.UtilisateurService;
import com.example.gestiondestock.entity.Utilisateur;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api")
public class UtilisateurController {
    
    @Autowired 
    private UtilisateurService userService;

    @GetMapping("/All-user")
    public ResponseEntity<List<Utilisateur>>getAllUser(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
    }


    @PostMapping("/Add-user")
    public ResponseEntity<Utilisateur>createUser(@RequestBody Utilisateur user){
        return ResponseEntity.status((HttpStatus.CREATED)).body(userService.createUtilisateur(user));
    }
    
    
    
}