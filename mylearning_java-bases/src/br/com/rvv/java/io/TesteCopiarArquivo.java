package br.com.rvv.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		// Leitura		
		FileInputStream fis = new FileInputStream("lorem.txt");		
//		InputStream fis = System.in;
		InputStreamReader isr = new InputStreamReader(fis);		
		BufferedReader br = new BufferedReader(isr);
		
		// Escrita
		OutputStream fis2 = System.out; // FileOutputStream("lorem2.txt");		
		OutputStreamWriter isr2 = new OutputStreamWriter(fis2);		
		BufferedWriter bw = new BufferedWriter(isr2);
		
		String linha = br.readLine();
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		bw.close();
		br.close();
	}
	
}
