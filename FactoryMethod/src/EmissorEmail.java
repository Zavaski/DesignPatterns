

public class EmissorEmail implements Emissor
{

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando Email a mensagem: ");
		System.out.println(mensagem);
	}

}
