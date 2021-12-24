
public class TesteDeDescontos {
	
	public static void main(String[] args) {
		CalculadorDeDesconto descontos = new CalculadorDeDesconto();
		
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("Caneta", 250.00));
		orcamento.adicionaItem(new Item("Lapis", 250.00));
		
		double descontoFinal = descontos.calcula(orcamento);
		
		System.out.println(descontoFinal);
	}

}
