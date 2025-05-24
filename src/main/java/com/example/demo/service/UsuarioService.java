package com.example.demo.service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) { this.repository = repository; }

    public List<Usuario> listarTodos() { return repository.findAll(); }

    public Optional<Usuario> buscarPorId(Long id) { return repository.findById(id); }

    public Usuario salvar(Usuario usuario) { return repository.save(usuario); }
}