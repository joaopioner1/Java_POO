package exercise_veiculo;

public class MainClass {

	public static void main(String[] args) {
		
		Cliente_Veiculo c1 = new Cliente_Veiculo("José Claudio", 38, 555687412, 981811615, 2000.00);
		
		c1.dadosCliente();
		
		Cliente_Veiculo c2 = new Cliente_Veiculo("João", 65,55221,88888,500.00);
		
		c2.dadosCliente();
		c2.setPrecoTotal(400);
		c2.comprar();
		c2.criarConta();
		c2.setDeposito(-100);
		c2.depositar();
		c2.comprar();

	}

}
