package chrisferdev.usuarioservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import chrisferdev.usuarioservice.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{

}
