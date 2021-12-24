package br.com.rvv.java.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacaoCliente {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Cliente cliente = new Cliente();
//		
//		cliente.setNome("Rafael");
//		cliente.setProfissao("Dev");
//		cliente.setCpf("123456");
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));		
//		oos.writeObject(cliente);		
//		oos.close();
//		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();

		ois.close();
		
		System.out.println(cliente.getNome());
		
		
	}

}
