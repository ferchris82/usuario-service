package chrisferdev.usuarioservice.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import chrisferdev.usuarioservice.entity.Usuario;
import chrisferdev.usuarioservice.exception.ResourceNotFoundException;
import chrisferdev.usuarioservice.repository.UsuarioRepository;
import chrisferdev.usuarioservice.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        String randomUsuarioId = UUID.randomUUID().toString();
        usuario.setUsuarioId(randomUsuarioId);
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario getUsuario(String usuarioId) {
        return usuarioRepository.findById(usuarioId).orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado con el ID : " + usuarioId));
    }
    
}
