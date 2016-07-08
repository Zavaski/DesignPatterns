public class Principal {

	public static void main(String[] args) throws InterruptedException {
		ControleDePonto controleDePonto = new ControleDePontoAdapter ();		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Marcelo martins");
		controleDePonto.registraEntrada(funcionario);
		Thread.sleep(3000);
		controleDePonto.registraSaida(funcionario);
		


	}
}
