package br.com.mylearning.alura_forum.controller;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.mylearning.alura_forum.controller.dto.DetalhesTopicoDto;
import br.com.mylearning.alura_forum.controller.dto.TopicoDto;
import br.com.mylearning.alura_forum.controller.form.AtualizacaoTopicoForm;
import br.com.mylearning.alura_forum.controller.form.TopicoForm;
import br.com.mylearning.alura_forum.model.Topico;
import br.com.mylearning.alura_forum.repository.CursoRepository;
import br.com.mylearning.alura_forum.repository.TopicoRepository;
import br.com.mylearning.alura_forum.repository.UsuarioRepository;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
	
	@Autowired
	private TopicoRepository topicoReposiotry;
	
	@Autowired
	private CursoRepository cursoReposiotry;
	
	@Autowired
	private UsuarioRepository usuarioReposiotry;
	
	// RequestMapping(value="/topicos", method="RequestMethod.GET)	
	@GetMapping
	@Cacheable(value="listaDeTopicos")
	public Page<TopicoDto> lista(@RequestParam(required=false) String nomeCurso,
			@PageableDefault(sort="mensagem", direction = Direction.DESC)  Pageable paginacao) {
		// http://localhost:8080/topicos?page=0&size=5&sort=id,desc	
		// a chamada fica como acima.
		
		// >>>>> Acima o jeito mais SIMPLES; abaixo o jeito mais COMPLEXO
		// @RequestParam int pagina, @RequestParam int qtd, @RequestParam String ordenacao) {
			
				
		// Pageable paginacao = PageRequest.of(pagina, qtd, Direction.ASC, ordenacao);
		
		if(nomeCurso == null) {
			Page<Topico> topicos = topicoReposiotry.findAll(paginacao);		 
			return TopicoDto.converter(topicos);
		} else {
			Page<Topico> topicos = topicoReposiotry.findByCursoNome(nomeCurso, paginacao);
			return TopicoDto.converter(topicos);
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<DetalhesTopicoDto> detalhar(@PathVariable Long id) {
		
		Optional<Topico> topico = topicoReposiotry.findById(id);
		if(topico.isPresent()) {
			return ResponseEntity.ok(new DetalhesTopicoDto(topico.get()));
		} 
		
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@Transactional
	@CacheEvict(value="listaDeTopicos", allEntries = true)
	public ResponseEntity<TopicoDto> cadastrar(@RequestBody @Valid TopicoForm topicoForm, UriComponentsBuilder uriBuilder) {
		
		Topico topico = topicoForm.converter(cursoReposiotry, usuarioReposiotry);
		topicoReposiotry.save(topico);
		
		URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(topico.getId()).toUri();
		return ResponseEntity.created(uri).body(new TopicoDto(topico));
		
	}
	
	@PutMapping("/{id}")
	@Transactional
	@CacheEvict(value="listaDeTopicos", allEntries = true)
	public ResponseEntity<TopicoDto> atualizar(@PathVariable Long id, @RequestBody @Valid AtualizacaoTopicoForm topicoForm) {
		
		Optional<Topico> optional = topicoReposiotry.findById(id);
		if(optional.isPresent()) {
			Topico topico = topicoForm.atualizar(id, topicoReposiotry);		
			return ResponseEntity.ok(new TopicoDto(topico));			
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	@CacheEvict(value="listaDeTopicos", allEntries = true)
	public ResponseEntity<?> remover(@PathVariable Long id) {
		
		Optional<Topico> optional = topicoReposiotry.findById(id);
		if(optional.isPresent()) {
			topicoReposiotry.deleteById(id);	
			return ResponseEntity.ok().build();			
		}
				
		return ResponseEntity.notFound().build();
	}
	
}
