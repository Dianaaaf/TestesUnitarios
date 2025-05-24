package com.example.usuarios;

import com.example.usuarios.controller.UsuarioController;
import com.example.usuarios.model.Usuario;
import com.example.usuarios.service.UsuarioService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UsuarioControllerTest {
    @Test
    public void testListarUsuarios() {
        UsuarioService service = mock(UsuarioService.class);
        UsuarioController controller = new UsuarioController(service);

        Usuario usuario1 = new Usuario();
        usuario1.setNome("João");
        usuario1.setEmail("joao@email.com");

        Usuario usuario2 = new Usuario();
        usuario2.setNome("Maria");
        usuario2.setEmail("maria@email.com");

        List<Usuario> lista = Arrays.asList(usuario1, usuario2);
        when(service.listarTodos()).thenReturn(lista);

        List<Usuario> resultado = controller.listar();
        assertEquals(2, resultado.size());
        verify(service, times(1)).listarTodos();
    }

    @Test
    public void testCriarUsuario() {
        UsuarioService service = mock(UsuarioService.class);
        UsuarioController controller = new UsuarioController(service);

        Usuario usuario = new Usuario();
        usuario.setNome("Carlos");
        usuario.setEmail("carlos@email.com");

        when(service.salvar(usuario)).thenReturn(usuario);
        Usuario resultado = controller.criar(usuario);

        assertEquals("Carlos", resultado.getNome());
        verify(service, times(1)).salvar(usuario);
    }
}