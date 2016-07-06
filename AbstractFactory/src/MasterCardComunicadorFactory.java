

public class MasterCardComunicadorFactory implements ComunicadorFactory{
	private EmissorCreator emissorCreator = new EmissorCreator ();
	private ReceptorCreator receptorCreator = new ReceptorCreator ();
	
	@Override
	public Emissor createEmissor() {
		// criando um emissor mastercard
		return emissorCreator.create(EmissorCreator.VISA);
	}

	@Override
	public Receptor createReceptor() {
		// criando um recepctor mastecard
		return receptorCreator.create(ReceptorCreator.VISA);
	}

}