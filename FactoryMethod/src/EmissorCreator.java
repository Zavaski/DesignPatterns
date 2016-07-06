

public class EmissorCreator {
	 public static final int SMS = 0;
	 public static final int EMAIL = 1;
	 public static final int JMS = 2;
	 //file:///C:/Users/E803110/PASTAS/Downloads/k19-k51-design-patterns-em-java.pdf  14
	 public Emissor create(int tipoDeEmissor)
	 {
		 if(tipoDeEmissor == EmissorCreator.SMS){
			 return new EmissorSMS();
		 }
		 else if (tipoDeEmissor== EmissorCreator.EMAIL){
			 return new EmissorEmail();
		 }
		 else if (tipoDeEmissor == EmissorCreator.JMS){
			 return new EmissorJMS();
		 }
		 else {
			 throw new IllegalArgumentException("Tipo de emissor não suportado");
			 
		 }
	 }
	 
}
