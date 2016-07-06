

public class EmissorSMS implements Emissor{

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando MSG a mensagem: ");
		System.out.println(mensagem);
		
	}

}
