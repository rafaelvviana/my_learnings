package br.com.rvv.java.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de entrada com arquivo		
		FileOutputStream fis = new FileOutputStream("lorem2.txt");		
		OutputStreamWriter isr = new OutputStreamWriter(fis);		
		BufferedWriter br = new BufferedWriter(isr);
		
		br.write("Lorem Ipsum simplesmente uma simulacao.");
		br.newLine();
		br.newLine();
		br.write("TEste2");
		
		br.close();
		
		
	}
	
}
