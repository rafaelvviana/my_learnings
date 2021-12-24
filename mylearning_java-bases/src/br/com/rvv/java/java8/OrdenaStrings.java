package br.com.rvv.java.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

//		Collections.sort(palavras);

		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
//		Collections.sort(palavras, comparador);

		palavras.sort(comparador);
		System.out.println(palavras);

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));		
		palavras.sort(Comparator.comparing(s -> s.length()));
		// equivalente a:
		Function<String, Integer> funcao = s -> s.length();
		Comparator<String> comparador2 = Comparator.comparing(funcao);
		palavras.sort(comparador2);
		//
		// method reference
		palavras.sort(Comparator.comparing(String::length));

		Consumer<String> consumidor = new ConsumidorDeString();
		palavras.forEach(consumidor);

		palavras.forEach(new Consumer<String>() {
			public void accept(String s) {
				System.out.println(s);
			}
		});

		// >>>
		System.out.println("***");
		palavras.forEach(s -> System.out.println(s));

	}
}

class ConsumidorDeString implements Consumer<String> {
	public void accept(String s) {
		System.out.println(s);
	}
}

class ComparadorDeStringPorTamanho implements Comparator<String> {
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}
}
