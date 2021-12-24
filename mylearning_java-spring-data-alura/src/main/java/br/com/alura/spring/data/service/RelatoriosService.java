package br.com.alura.spring.data.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.alura.spring.data.orm.Funcionario;
import br.com.alura.spring.data.orm.FuncionarioProjecao;
import br.com.alura.spring.data.repository.FuncionarioRepository;

@Service
public class RelatoriosService {

	private Boolean system = true;
	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private final FuncionarioRepository funcionarioRepository;
	public RelatoriosService(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}
	
	public void inicial(Scanner scanner) {
		while(system) {
			System.out.println("Qual acao de cargo deseja executar");
			System.out.println("0 - Sair");
			System.out.println("1 - Pesquisar por Nome");
			System.out.println("2 - Pesquisar por CPF");
			System.out.println("3 - Pesquisar por Nome, DataContratacao e Salario");
			System.out.println("4 - Pesquisar funcionarios com data contr. maior que");
			System.out.println("5 - Pesquisa Funcionario por Salario ");
			
			int action = scanner.nextInt();
			
			switch (action) {
			case 1:
				buscaFuncionarioPorNome(scanner);
				break;
			case 2:
				buscaFuncionarioPorCpf(scanner);
				break;
			case 3:
				buscaFuncionarioPorNomeDataContratacaoESalarioMaiorQue(scanner);
				break;
			case 4:
				buscaFuncionarioDataContratacaoMaioQue(scanner);
				break;
			case 5: 
				pesquisaFuncionarioSalario();
				break;
			default:
				system = false;
				break;
			}			
		}		
	}
	
	private void buscaFuncionarioPorNome(Scanner scanner) {
		System.out.println("Qual nome deseja pesquisar?");
		String nome = scanner.next();		
		List<Funcionario> list = funcionarioRepository.findByNome(nome);
		list.forEach(System.out::println);		
	}
	
	private void buscaFuncionarioPorCpf(Scanner scanner) {
		System.out.println("Qual CPF deseja pesquisar?");
		String cpf = scanner.next();		
		List<Funcionario> list = funcionarioRepository.findByCpf(cpf);
		list.forEach(System.out::println);		
	}
	
	private void buscaFuncionarioPorNomeDataContratacaoESalarioMaiorQue(Scanner scanner) {
		System.out.println("Qual o nome?");
		String nome = scanner.next();
		
		System.out.println("Qual a data?");
		String data = scanner.next();
		LocalDate localDate = LocalDate.parse(data, formatter);
		
		System.out.println("Qual o salário?");
		Double salario = scanner.nextDouble();
		
		List<Funcionario> list = funcionarioRepository.findNomeSalarioMaiorDataContratacao(nome, salario, localDate);
		list.forEach(System.out::println);		
	}
	
	private void buscaFuncionarioDataContratacaoMaioQue(Scanner scanner) {
		System.out.println("Data Contratação?");
		String data = scanner.next();
		LocalDate dataContratacao = LocalDate.parse(data, formatter);
		
		List<Funcionario> list = funcionarioRepository.findDataContratacaoMaior(dataContratacao);
		list.forEach(System.out::println);
	}
	
	private void pesquisaFuncionarioSalario() {
		List<FuncionarioProjecao> list = funcionarioRepository.findFuncionarioSalario();
		list.forEach(f -> System.out.println("Funcionario: id: " + f.getId() 
					+ " | Nome: " + f.getNome()
					+ " | Salário: " + f.getSalario()));
	}
	
}
