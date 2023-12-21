package com.example.gestiondestock.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.gestiondestock.service.UtilisateurService;
import com.example.gestiondestock.entity.Utilisateur;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;






@RestController
@RequestMapping("/api/utilisateur")
public class UtilisateurController {
    
    @Autowired 
    private UtilisateurService userService;

    @GetMapping("/All-user")
    public ResponseEntity<List<Utilisateur>>getAllUser(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
    }

    @GetMapping("get-user/{utilisateur-id}")
     public ResponseEntity<Optional<Utilisateur>> getUser(@PathVariable("utilisateur-id") Long userId){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findUser(userId));
    }
    
    
    @PostMapping("/Add-user")
    public void createUser(@RequestBody Utilisateur user){
        ResponseEntity.status((HttpStatus.CREATED)).body(userService.createUtilisateur(user));
    }
    
    @DeleteMapping(path = "/delete/{utilisateur-id}")
    public void deleteUser(@PathVariable("utilisateur-id") Long userId){
        userService.deleteUtilisateur(userId);
    }
   
    @PutMapping("/update/{utilisateur-id}")
    public ResponseEntity<Optional<Utilisateur>> upateUtilisateur(@PathVariable("utilisateur-id") Long userId, @RequestBody Utilisateur updateUser){
        return ResponseEntity.status(HttpStatus.OK)
        .body(userService.updateUtilisateur(userId, updateUser));
    }
   
}