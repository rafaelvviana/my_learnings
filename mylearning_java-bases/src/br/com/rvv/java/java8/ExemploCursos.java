package br.com.rvv.java.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

public class ExemploCursos {	
	
	public static void main(String[] args) {
			
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		cursos.forEach(c -> System.out.println(c.getNome()));
		
		System.out.println("**");
		cursos.stream()
		 	.filter(c -> c.getAlunos() >= 100)
		 	.forEach(c -> System.out.println(c.getNome()));;

		System.out.println("**");
		cursos.stream()
		 	.filter(c -> c.getAlunos() >= 100)
		 	.map(c -> c.getAlunos())
		 	.forEach(total -> System.out.println(total));
		
		System.out.println("**");
		cursos.stream()
		 	.filter(c -> c.getAlunos() >= 100)
		 	.map(Curso::getAlunos)
		 	.forEach(System.out::println);
		System.out.println("**");
		int sum = cursos.stream()
		 	.filter(c -> c.getAlunos() >= 100)
		 	.mapToInt(Curso::getAlunos)
		 	.sum();
		System.out.println(sum);
		
		System.out.println("**");
		
		Optional<Curso> optionalCurso = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.findAny();
		 	
		Curso curso =  optionalCurso.orElse(null);
		System.out.println(curso.getNome());
				
		optionalCurso.ifPresent(c -> System.out.println(c.getNome()));

		System.out.println("**");
		
		cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.findAny()
				.ifPresent(c -> System.out.println(c.getNome()));
		
		System.out.println("**");
		
		// Para trabalhar como Strem filtrado, devo guardar o resultado:
		List<Curso> resultado = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.collect(Collectors.toList());
		
		// Resultado mapeado
		Map<Object, Object> mapa = cursos 
				.stream() 
				.filter(c -> c.getAlunos() > 100) 
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
		
		System.out.println(mapa);
			
	}
}