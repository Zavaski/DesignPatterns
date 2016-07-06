

public class VisaComunicadorFactory implements ComunicadorFactory{
	private EmissorCreator emissorCreator = new EmissorCreator ();
	private ReceptorCreator receptorCreator = new ReceptorCreator ();
	
	@Override
	public Emissor createEmissor() {
		// criando um emissor visa
		return emissorCreator.create(EmissorCreator.VISA);
	}

	@Override
	public Receptor createReceptor() {
		// criando um recepctor visa
		return receptorCreator.create(ReceptorCreator.VISA);
	}

}
