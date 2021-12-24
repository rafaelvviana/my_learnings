package br.com.rvv.java.io;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStream {

	public static void main(String[] args) throws IOException {
		
		// Escrita
		PrintStream ps = new PrintStream("lorem2.txt");
		
		ps.println("Lorem Ipsum simplesmente uma simulacao.");
		ps.println();
		ps.println("PrintStream");
		ps.println();
		ps.println("TEste2");		
		ps.close();		
	}
	
}
