package veiculo2;

public abstract class Veiculo {
	//Author: Joao Vitor Souza Pioner | Date: 30/12/20

	private String cor, modelo;
	private boolean ligado, portasAF;
	private double velMax, velAtual;
	private int capMaxPes;
	
	public abstract void acelerar(double acelera);
	public abstract void frear();
	public abstract void ligar();
	public abstract void desligar();
	public abstract void abrirPortas();
	public abstract void fecharPortas();
	public abstract void status();
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public boolean getLigado() {
		return ligado;
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public boolean getPortasAF() {
		return portasAF;
	}
	
	public void setPortasAF(boolean portasAF) {
		this.portasAF = portasAF;
	}
	
	public double getVelMax() {
		return velMax;
	}
	
	public void setVelMax(double velMax) {
		this.velMax = velMax;
	}
	
	public double getVelAtual() {
		return velAtual;
	}
	
	public void setVelAtual(double valAtual) {
		this.velAtual = valAtual;
	}
	
	public int getCapMaxPes() {
		return capMaxPes;
	}
	
	public void setCapMaxPes(int capMaxPes) {
		this.capMaxPes = capMaxPes;
	}
}
