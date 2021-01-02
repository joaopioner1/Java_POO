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
/* I made this program because I wanted to practice some of the topics I learned yesterday.
 * It's been really nice studying programming. Now it is much more productive than it was a few months ago.
 * Let me explain my program: I made a class named Veiculo. This class is the abstract class, so I put all the methods there.
 * those other classes are Veiculo's sons. I code some methods about what a car does; like open its doors. 
 */
