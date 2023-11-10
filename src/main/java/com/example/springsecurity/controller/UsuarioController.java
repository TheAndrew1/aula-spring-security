package com.example.springsecurity.controller;

import com.example.springsecurity.entity.Usuario;
import com.example.springsecurity.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    @GetMapping("/list")
    public ResponseEntity<List<Usuario>> findAll(){
        try {
            List<Usuario> usuarios = usuarioService.findAll();
            return ResponseEntity.ok(usuarios);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(new ArrayList<>());
        }
    }

    @PostMapping("/add")
    public ResponseEntity<Usuario> create(@RequestBody Usuario usuario){
        try {
            Usuario usuarioSalvo = usuarioService.create(usuario);
            return ResponseEntity.ok(usuarioSalvo);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(new Usuario());
        }
    }
}
