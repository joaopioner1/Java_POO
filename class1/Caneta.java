package class1;

public class Caneta {

	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status () {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
		System.out.println("");
	}
	
	public void rabiscar() {
		 if (this.tampada == false) {
			 System.out.println("Estou rabiscando!!");
		 } else {
			 System.out.println("Nao consigo rabiscar!!");
		 }
	}
	
	private void tampar() {
		this.tampada = true;
	}
	
	private void destampar() {
		this.tampada = false;
	}
}
