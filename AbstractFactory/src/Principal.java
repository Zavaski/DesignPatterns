

public class Principal {
		
	public static void main(String[] args) {
		ComunicadorFactory comunicardoFactory = new VisaComunicadorFactory();

		String transacao = "Valor = 560; Senha=123";

		Emissor emissor = comunicardoFactory.createEmissor();
		emissor.envia(transacao);
		
		Receptor receptor = comunicardoFactory.createReceptor();
		String mensagem = receptor.recebe();
		System.out.println(mensagem);
	}

	
}
