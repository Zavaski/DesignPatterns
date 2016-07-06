

public class Principal {
	public static void main(String[] args) {
/*
		Emissor emissorSMS = new EmissorSMS();
		emissorSMS.envia("K19 - Treinamentos ");
		
		Emissor emissorJMS = new EmissorJMS();
		emissorJMS.envia("K19 - Treinamentos ");
		
		Emissor emissorEmail = new EmissorEmail();
		emissorEmail.envia("K19 - Treinamentos ");
		*/
	
		EmissorCreator creator = new EmissorCreator();
		
		Emissor em1 = creator.create(EmissorCreator.SMS);
		em1.envia("Emissor 1");
		
		Emissor em2 = creator.create(EmissorCreator.EMAIL);
		em2.envia("Emissor 2");
		
		Emissor em3 = creator.create(EmissorCreator.JMS);
		em3.envia("Emissor 3");
	}
}
