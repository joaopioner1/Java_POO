package veiculo2;

public class Caminhonete extends Carro {
	//Author: Joao Vitor Souza Pioner | Date: 30/12/20
	
	private boolean carregada;

	public void carregarCarroceria() {
		this.setVelMax(getVelMax() - 60);
		System.out.println("Caminhoneta carregada!");
	}
	
	public boolean getCarregada() {
		return carregada;
	}

	public void setCarregada(boolean carregada) {
		this.carregada = carregada;
	}
	
	
}
