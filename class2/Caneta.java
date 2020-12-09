package class2;

public class Caneta {
	
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	public Caneta(String a, String b, float c) { //construtor
		
		this.tampar();
		this.cor = a;
		this.modelo = b;
		this.ponta = c;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public float getPonta() {
		return ponta;
	}
	
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	public boolean isTampada() {
		return tampada;
	}
	
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void status() {
		System.out.println("SOBRE A CANETA:");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}
}
	


