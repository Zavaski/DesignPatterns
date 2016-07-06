

public class EmissorMasterCard implements Emissor{

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando a mensagem mensagem para a Mastercard");
		System.out.println(mensagem);
		
	}

}
