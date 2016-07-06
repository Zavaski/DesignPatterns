

public class EmissorJMS implements Emissor{

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando JMS a mensagem: ");
		System.out.println(mensagem);
	}

}
