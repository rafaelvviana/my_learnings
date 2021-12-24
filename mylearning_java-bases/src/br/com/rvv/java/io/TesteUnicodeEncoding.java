package br.com.rvv.java.io;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {
	
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		
		String s = "C";
		
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.println(bytes.length + ", windows-1252");
		
		byte[] bytes2 = s.getBytes("UTF-16");
		System.out.println(bytes2.length + ", UTF-16");
		
		byte[] bytes3 = s.getBytes(StandardCharsets.UTF_16);
		System.out.println(bytes3.length + ", UTF-16");

		byte[] bytes4 = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes4.length + ", ASCII");

		
		byte[] bytes5 = s.getBytes("windows-1252");
		System.out.println(bytes5.length + ", windows-1252");
		String sNovo = new String(bytes5, "windows-1252");
		System.out.println(sNovo);
		

		byte[] bytes6 = s.getBytes("UTF-16");
		System.out.println(bytes6.length + ", UTF-16");
		sNovo = new String(bytes6, "windows-1252");
		System.out.println(sNovo);
		
		byte[] bytes7 = s.getBytes(StandardCharsets.UTF_16);
		System.out.println(bytes7.length + ", UTF-16");
		sNovo = new String(bytes7, "UTF-16");
		System.out.println(sNovo);

		byte[] bytes8 = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes8.length + ", ASCII");
		sNovo = new String(bytes8, "US-ASCII");
		System.out.println(sNovo);
	
	}
	
	

}

