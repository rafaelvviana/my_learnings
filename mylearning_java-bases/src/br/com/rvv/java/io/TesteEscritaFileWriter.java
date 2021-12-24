package br.com.rvv.java.io;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		// Escrita
		FileWriter fw = new FileWriter("lorem2.txt");		
		fw.write("Lorem Ipsum simplesmente uma simulacao.");
		fw.write(System.lineSeparator());
		fw.write(System.lineSeparator());
		fw.write("TEste2");		
		fw.close();		
	}
	
}
