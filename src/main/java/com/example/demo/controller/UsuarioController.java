package com.example.demo.controller;

import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;
    public UsuarioController(UsuarioService service) { this.service = service; }

    @GetMapping
    public List<Usuario> listar() { return service.listarTodos(); }

    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario) { return service.salvar(usuario); }
}