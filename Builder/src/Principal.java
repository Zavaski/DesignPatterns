

public class Principal {

	public static void main(String[] args) {
		//instancia onde constroi o boleto
		BoletoBuilder boletoBuilder = new BBBoletoBuilder();
		GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
		Boleto boleto = geradorDeBoleto.gerarBoleto();
		System.out.println(boleto);
		
	}
	
}
