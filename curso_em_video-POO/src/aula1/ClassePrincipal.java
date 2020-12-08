package aula1;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		
		c1.cor = "Vermelho";
		c1.ponta = 0.5f;
		c1.tampar();
		c1.rabiscar();
		c1.status();
		
		Caneta c2 = new Caneta();
		
		c2.rabiscar();
		c2.cor = "azul";
		c2.modelo = "Bic";
		c2.destampar();
		c2.status();
		
	}

}
