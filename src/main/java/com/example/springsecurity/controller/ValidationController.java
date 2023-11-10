package com.example.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ValidationController {
    @GetMapping("/validacao-usuario")
    public String loginUser(){ return "<h1>Login validado</h1>"; }

    @GetMapping("/liberar-admin")
    public String adminAccess(){ return "<h1>Usuário é admin</h1>"; }
}
