import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13;
	}

	@Override
	boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		List<String> noOrcamento = new ArrayList<String>();

        for(Item item : orcamento.getItens()) {
          if(noOrcamento.contains(item.getNome())) 
        	  return true;
          else 
        	  noOrcamento.add(item.getNome());
        }
        
        return false;
	}

	@Override
	double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getItens().size());
	}

}
