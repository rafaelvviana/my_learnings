package br.com.rvv.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeituraScannerParse {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("contas.csv"));		
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);
			
//			String[] valores = linha.split(",");			
//			System.out.println(Arrays.toString(valores));
			
			Scanner scanLinha = new Scanner(linha);
			scanLinha.useDelimiter(",");
			
			do {
				String valor = scanLinha.next();
				System.out.println(valor);
			} while (scanLinha.hasNext());
			
			System.out.println("--**--");
		}
		
		
	}

}
