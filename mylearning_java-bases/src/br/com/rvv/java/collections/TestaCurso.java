package br.com.rvv.java.collections;

public class TestaCurso {
	
	public static void main(String[] args) {
		
		Curso curso = new Curso("Dominando Java", "Rafel Viana");
		
//		List<Aula> aulas = curso.getAulas();
//		System.out.println(aulas);
		
//		aulas.add(new Aula("Trabalhando arrayList", 21));
//		System.out.println(aulas);
		
//		curso.getAulas().add(new Aula("Aula 2 de listas", 8));
//		System.out.println(aulas == curso.getAulas());		
		
		curso.adiciona(new Aula("Trabalhando arrayList", 21));
		curso.adiciona(new Aula("Aula 2 de listas", 8));		
		curso.adiciona(new Aula("Aula3", 14));
		System.out.println(curso.getAulas());
		
	}

}
