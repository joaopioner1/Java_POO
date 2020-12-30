package veiculo2;

public class MainClassVeiculo {
	//Author: Joao Vitor Souza Pioner | Date: 30/12/20
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.buzinar("Get out you asshole");
		carro.ligar();
		carro.acelerar(20);
		carro.frear();
		carro.desligar();
		carro.acelerar(50);
		carro.status();
		
		Caminhonete cam = new Caminhonete();
		
		cam.abrirPortas();
		cam.status();
	}

}
