package com.example.gestiondestock.dto;

import com.example.gestiondestock.entity.AppUser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class AuthResponse {
    private final String token;
    private final AppUser user;
}
