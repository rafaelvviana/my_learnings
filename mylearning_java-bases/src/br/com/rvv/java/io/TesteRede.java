package br.com.rvv.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TesteRede {

	public static void main(String[] args) throws IOException {
		
		Socket s = new Socket();
		
		// Leitura		
		InputStream fis = s.getInputStream();
		
		InputStreamReader isr = new InputStreamReader(fis);		
		BufferedReader br = new BufferedReader(isr);
		
		// Escrita
		OutputStream fis2 = s.getOutputStream(); 
				
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
