package br.com.mylearning.alura_forum.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mylearning.alura_forum.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Usuario findByNome(String nome);
	Optional<Usuario> findByEmail(String email);
}
