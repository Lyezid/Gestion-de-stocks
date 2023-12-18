package com.example.gestiondestock.service;

import java.util.List;

// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestiondestock.repository.UtilisateurRepository;
import com.example.gestiondestock.entity.Utilisateur;


@Service
public class UtilisateurService {
    
    @Autowired
    private UtilisateurRepository userRepository;

    public List<Utilisateur> findAll(){
        return userRepository.findAll();
    }

    public Utilisateur createUtilisateur(Utilisateur utilisateur){
        return userRepository.save(utilisateur);
    }

}