
public class IKCV extends TemplateDeImpostoCondicional {

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for(Item item: orcamento.getItens()) {
			if (item.getValor() > 100) return true;
		}
		return false;
	}

	@Override
	double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500.0 && temItemMaiorQue100ReaisNo(orcamento);
	}

	@Override
	double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	
}
