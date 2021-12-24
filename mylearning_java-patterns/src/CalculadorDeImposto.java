
public class CalculadorDeImposto {

	public void realizaCalculo(Orcamento orcamento, Imposto impostoqualquer) {
	
		double icms = impostoqualquer.calcula(orcamento);
		System.out.println(icms);		
	}
}
