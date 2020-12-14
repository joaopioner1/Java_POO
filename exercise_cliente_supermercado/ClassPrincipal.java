package exercise_cliente_supermercado;

public class ClassPrincipal {

	public static void main(String[] args) {
		//Author: Joao Vitor Souza Pioner | Date: 14/12/2020 9:47
		
		Cliente_Supermercado cliente = new Cliente_Supermercado(20, 'm', "Claudio");
		
		cliente.setCredito(false);
		cliente.setDevedor(false);
		cliente.mostraInformacoes();
		cliente.compra();
		cliente.apagarCliente();
		cliente.mostraInformacoes();

	}

}
