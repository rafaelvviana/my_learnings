package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioAlto() {		
		BonusService service = new BonusService();	
				
//		assertThrows(IllegalArgumentException.class, 
//				() -> service.calcularBonus(new Funcionario("Rafael", LocalDate.now(), new BigDecimal(25000))));
		
		// outra maneira de se fazer
		
		try {
			service.calcularBonus(new Funcionario("Rafael", LocalDate.now(), new BigDecimal(25000)));
			fail("Não deu exceção.");
		} catch(Exception e) {	
			assertEquals("Funcionario com salário maior que 10mil reais não pode ter bônus.", e.getMessage());
			
		} 
	}
	
	@Test
	void bonusDeveriaSerDezPorcentoDoSalario() {		
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Rafael", LocalDate.now(), new BigDecimal(2500)));
		
		assertEquals(new BigDecimal("250.00"), bonus);
	}
	
	@Test
	void bonusDeveriaSerDezPorcentoParaSalarioDeDezMilReais() {		
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Rafael", LocalDate.now(), new BigDecimal(10000)));
		
		assertEquals(new BigDecimal("1000.00"), bonus);
	}

}
