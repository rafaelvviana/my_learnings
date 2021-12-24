package br.com.bytebank.banco.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.ClienteBanco;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		ClienteBanco cliente = new ClienteBanco();
		cliente.setNome("Rafael");
		cliente.setProfissao("Dev");
		cliente.setCpf("123456");
		
		ContaCorrente cc = new ContaCorrente(123, 123);
		cc.setTitular(cliente);
		cc.deposita(101.0);
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));		
		oos.writeObject(cc);		
		oos.close();
		
	}
	
}
