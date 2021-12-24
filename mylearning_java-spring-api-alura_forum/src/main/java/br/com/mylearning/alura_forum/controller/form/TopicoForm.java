package br.com.mylearning.alura_forum.controller.form;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

import br.com.mylearning.alura_forum.model.Curso;
import br.com.mylearning.alura_forum.model.Topico;
import br.com.mylearning.alura_forum.model.Usuario;
import br.com.mylearning.alura_forum.repository.CursoRepository;
import br.com.mylearning.alura_forum.repository.UsuarioRepository;

public class TopicoForm {
	
	@NotNull @NotEmpty @Length(min = 5)
	private String titulo;
	@NotNull @NotEmpty @Length(min = 10)
	private String mensagem;
	@NotNull @NotEmpty
	private String nomeCurso;
	@NotNull @NotEmpty
	private String nomeQualquer;
	
	public String getNomeQualquer() {
		return nomeQualquer;
	}
	public void setNomeQualquer(String nomeQualquer) {
		this.nomeQualquer = nomeQualquer;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
		
	public Topico converter(CursoRepository cursoRepository, UsuarioRepository usuarioRepository) {		
		Curso curso = cursoRepository.findByNome(nomeCurso);
		System.out.println("Nome que veio do Postman:" + nomeQualquer);
		Usuario autor = usuarioRepository.findByNome(nomeQualquer);
		System.out.println("Usuario encontrado:" + autor.getNome());
		return new Topico(titulo, mensagem, curso, autor);
	}
	
	

}
