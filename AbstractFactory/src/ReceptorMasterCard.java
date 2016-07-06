

public class ReceptorMasterCard implements Receptor{
	
	@Override
	public String recebe() {
		System.out.println("Recebendo mensagem da Mastercard");
		String mensagem = "Mensagem da Mastercard";
		return mensagem;
		
	}

}
