package chrisferdev.usuarioservice.service;

import java.util.List;

import chrisferdev.usuarioservice.entities.Usuario;

public interface UsuarioService {

    Usuario saveUsuario(Usuario usuario);

    List<Usuario> getAllUsuarios();

    Usuario getUsuario(String usuarioId);
    
}
