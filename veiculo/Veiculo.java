package veiculo;

public abstract class Veiculo {
	// Author: Joao Vitor Souza Pioner Date: 26/12/20202

	private String modelo, combustivel, cor;
	private double capMaxCombustivel, quantNoTanque, velocidadeMax, velocidadeAtual;
	private int anoCriacao, capPessoas;
	private boolean ligar;

	public void ligar() {
		this.setLigar(true);
	}

	public void desligar() {
		this.setLigar(false);
	}

	public void abastecer(double combNoTanque, double quantInserida) {
		if (combNoTanque < this.getCapMaxCombustivel() && quantInserida < this.getCapMaxCombustivel()) {
			this.setQuantNoTanque(this.getQuantNoTanque() + quantInserida);
			System.out.println("Abastecimento feito com sucesso!");
		} else {
			System.out.println("Impossível realizar abastecimento!");
		}
	}

	public void acelerar(int acelerar) {

		if (this.getLigar()) {
			this.setVelocidadeAtual(this.getVelocidadeAtual() + acelerar);
		} else {
			System.out.println("Impossível acelerar porque o veículo está desligado.");
		}
	}

	public void frear() {

		if (this.getLigar() && this.getVelocidadeAtual() < 10) {
			this.setVelocidadeAtual(0);
		} else if (this.getVelocidadeAtual() > 0) {
			this.setVelocidadeAtual(this.getVelocidadeAtual() - 10);
		} else {
			System.out.println("Impossível frear porque o veículo está desligado ou parado.");
		}
	}

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

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public double getVelocidadeMax() {
		return velocidadeMax;
	}

	public void setVelocidadeMax(double velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}

	public double getCapMaxCombustivel() {
		return capMaxCombustivel;
	}

	public void setCapMaxCombustivel(double capMaxCombustivel) {
		this.capMaxCombustivel = capMaxCombustivel;
	}

	public double getQuantNoTanque() {
		return quantNoTanque;
	}

	public void setQuantNoTanque(double quantNoTanque) {
		this.quantNoTanque = quantNoTanque;
	}

	public int getAnoCriacao() {
		return anoCriacao;
	}

	public void setAnoCriacao(int anoCriacao) {
		this.anoCriacao = anoCriacao;
	}

	public int getCapPessoas() {
		return capPessoas;
	}

	public void setCapPessoas(int capPessoas) {
		this.capPessoas = capPessoas;
	}

	public boolean getLigar() {
		return ligar;
	}

	public void setLigar(boolean ligar) {
		this.ligar = ligar;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
}
