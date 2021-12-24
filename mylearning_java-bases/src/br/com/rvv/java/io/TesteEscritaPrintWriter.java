package br.com.rvv.java.io;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintWriter {

	public static void main(String[] args) throws IOException {
		
		// Escrita
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("Lorem Ipsum simplesmente uma simulacao.");
		ps.println();
		ps.println("PrintWriter");
		ps.println();
		ps.println("TEste2");		
		ps.close();		
	}
	
}
