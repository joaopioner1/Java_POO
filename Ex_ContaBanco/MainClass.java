package Ex_ContaBanco;

public class MainClass {

	public static void main(String[] args) {
		
		Conta c = new Conta("Jo�o V�tor", "Bradesco", "04/02/2021", 521, 2568.55);
		
		c.abrirConta(); //esse m�todo � in�til porque eu j� boto os dados da pessoa no contrutor, enfim, releve
		c.status();
		System.out.println("-------------------");
		c.depositar(100.50);
		c.status();
		System.out.println("-------------------");
		c.sacar(500);
		c.status();
		c.sacar(8000); //fazer m�todo para pagar a taxa do empr�stimo
		c.calculaRendimento();
	}
}
