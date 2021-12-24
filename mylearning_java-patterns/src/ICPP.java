
public class ICPP extends TemplateDeImpostoCondicional {

	@Override
	double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500.0;
	}

	@Override
	double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}
	

}
