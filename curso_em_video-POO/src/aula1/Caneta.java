package aula1;

public class Caneta {

	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status () {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
		System.out.println("");
	}
	
	void rabiscar() {
		 if (this.tampada == false) {
			 System.out.println("Estou rabiscando!!");
		 } else {
			 System.out.println("Nao consigo rabiscar!!");
		 }
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}
}
