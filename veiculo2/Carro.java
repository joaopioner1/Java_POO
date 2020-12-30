package veiculo2;

public class Carro extends Veiculo {

	@Override
	public void acelerar() {
		if (this.getLigado()) {
			this.setVelAtual(this.getVelAtual() + 10);
		} else {
			System.out.println("Imposs�vel acelerar, carro desligado.");
		}
	}

	@Override
	public void frear() {
		if (this.getLigado()) {
			if (this.getVelAtual() < 10) {
				this.setVelAtual(0);
			} else {
				this.setVelAtual(this.getVelAtual() - 10);
			}
		} else {
			System.out.println("Carro desligado, imposs�vel frear.");
		}
	}

	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirPortas() {
		if (this.getVelAtual() <= 15) {
			this.setPortasAF(true);
		} else {
			System.out.println("Diminua a velocidade para abrir a porta!");
		}
	}

	@Override
	public void fecharPortas() {
		if (this.getPortasAF()) {
			this.setPortasAF(false);
		} else {
			System.out.println("As portas j� est�o fechadas!");
		}
	}

	@Override
	public void status() {
		System.out.println("#---Ve�culo informa��es---#");
		System.out.println("Ligado? " + this.getLigado());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Portas abertas? " + this.getPortasAF());
		System.out.println("Capacidade m�xima de pessoas: " + this.getCapMaxPes());
		System.out.println("Velocidade atual: " + this.getVelAtual());
		System.out.println("Velocidade m�xima: " + this.getVelMax());
		System.out.println("--------------------------------");
	}
	
	public void buzinar(String frase) {
		System.out.println("Sa� da frente babaca!");
	}
}
