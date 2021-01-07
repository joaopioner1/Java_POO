package ckfight;

public abstract class Lutadores {
	//Author: Joao Vitor Souza Pioner | Date: 07/01/21 16:46
	
	private String nome, arma, especial;
	private double maxDano, pontosVida, energia;
	private boolean vivo, classificado;
	
	public abstract void esquivar();
	public abstract void golpeCritico();
	public abstract void golpe();
	public abstract void usarEspecial();
	public abstract void carregarEnergia();
	public abstract void acabarLuta();
	public abstract void mostrarStatus();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getArma() {
		return arma;
	}
	
	public void setArma(String arma) {
		this.arma = arma;
	}
	
	public String getEspecial() {
		return especial;
	}
	
	public void setEspecial(String especial) {
		this.especial = especial;
	}
	
	public double getMaxDano() {
		return maxDano;
	}
	
	public void setMaxDano(double maxDano) {
		this.maxDano = maxDano;
	}
	
	public double getPontosVida() {
		return pontosVida;
	}
	
	public void setPontosVida(double pontosVida) {
		this.pontosVida = pontosVida;
	}
	
	public double getEnergia() {
		return energia;
	}
	
	public void setEnergia(double energia) {
		this.energia = energia;
	}
	
	public boolean getVivo() {
		return vivo;
	}
	
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
	public boolean getClassificado() {
		return classificado;
	}
	
	public void setClassificado(boolean classificado) {
		this.classificado = classificado;
	}
}
