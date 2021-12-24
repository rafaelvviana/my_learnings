package br.com.rvv.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScannerParse2 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");		
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();

			Scanner scanLinha = new Scanner(linha);
			scanLinha.useLocale(Locale.US);
			scanLinha.useDelimiter(",");
			
//			String valor1 = scanLinha.next();
//			int valor2 = scanLinha.nextInt();
//			int valor3 = scanLinha.nextInt();
//			String valor4 = scanLinha.next();
//			double valor5 = scanLinha.nextDouble();
//			
//			String linhaFormatada = String.format("%s - %04d-%d: %s %f", valor1, valor2, valor3, valor4, valor5);
//			System.out.println(linhaFormatada);
			
			String tipoConta = scanLinha.next();
            int agencia = scanLinha.nextInt();
            int numero = scanLinha.nextInt();
            String titular = scanLinha.next();
            double saldo = scanLinha.nextDouble();

            System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %20s: %05.2f %n", 
            		 tipoConta, agencia, numero, titular, saldo);

		}
		
		
	}

}
