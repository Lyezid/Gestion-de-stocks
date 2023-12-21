package com.example.gestiondestock.service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Utilisateur> findUser(Long utilisateurId){
        return userRepository.findById(utilisateurId);
    }

    public Utilisateur createUtilisateur(Utilisateur utilisateur){
        return userRepository.save(utilisateur);
    }
    
    public void deleteUtilisateur(Long utilisateurId){
        userRepository.deleteById(utilisateurId);
    }

    public Optional<Utilisateur> updateUtilisateur(Long utilisateurId, Utilisateur updateUser){
        return userRepository.findById(utilisateurId).map(
                                        user -> {
                                            user.setNom(updateUser.getNom());
                                            user.setPrenom(updateUser.getPrenom());
                                            user.setEmail(updateUser.getEmail());
                                            user.setNni(updateUser.getNni());
                                            user.setType(updateUser.getType());
                                            return userRepository.save(updateUser);
                                        }
                                        );
    }
}