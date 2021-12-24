package br.com.rvv.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaBufferedWriter {

	public static void main(String[] args) throws IOException {
		
		// Escrita
		BufferedWriter bw = new BufferedWriter( new FileWriter("lorem2.txt"));
		
		bw.write("Lorem Ipsum simplesmente uma simulacao.");
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write("TEste2");		
		bw.close();		
	}
	
}
