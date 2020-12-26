package veiculo;

public abstract class Veiculo {
	//Author: Joao Vitor Souza Pioner Date: 26/12/20202
	private String cor;
	private String modelo;
	private String combustivel;
	private double velocidadeMax;
	private double capMaxCombustivel;
	private double quantNoTanque;
	private int anoCriacao;
	private int capPessoas;
	
	public void abastecer(double combNoTanque, double quantInserida) {
		
		if (combNoTanque < this.getCapMaxCombustivel() && quantInserida < this.getCapMaxCombustivel()) {
			this.setQuantNoTanque(this.getQuantNoTanque() + quantInserida);
			System.out.println("Abastecimento feito com sucesso!");
		} else {
			System.out.println("Impossível realizar abastecimento!");
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
}
