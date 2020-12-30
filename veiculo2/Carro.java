package veiculo2;

public class Carro extends Veiculo {
	//Sobreposicao
	
	@Override
	public void ligar() {
		if (this.getLigado() == false) {
			this.setLigado(true);
		} else {
			System.out.println("Carro estava ligado.");
		}
	}

	@Override
	public void desligar() {
		if (this.getLigado()) {
			this.setLigado(false);
		} else {
			System.out.println("Carro estava desligado.");
		}
	}
	@Override
	public void acelerar(double acelera) {
		if (this.getLigado()) {
			this.setVelAtual(this.getVelAtual() + acelera);
		} else {
			System.out.println("Impossível acelerar, carro desligado.");
		}
	}

	@Override
	public void frear() {
		if (this.getLigado() == true) {
			if (this.getVelAtual() < 10) {
				this.setVelAtual(0);
			} else {
				this.setVelAtual(this.getVelAtual() - 10);
			}
		} else {
			System.out.println("Carro desligado, impossível frear.");
		}
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
			System.out.println("As portas já estão fechadas!");
		}
	}

	@Override
	public void status() {
		System.out.println("#---Veículo informações---#");
		System.out.println("Ligado? " + this.getLigado());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Portas abertas? " + this.getPortasAF());
		System.out.println("Capacidade máxima de pessoas: " + this.getCapMaxPes());
		System.out.println("Velocidade atual: " + this.getVelAtual());
		System.out.println("Velocidade máxima: " + this.getVelMax());
		System.out.println("--------------------------------");
	}
	//Sobrecarga
	public void buzinar(String frase) {
		System.out.println(frase);
	}
	
	public void buzinar(char a) {
		System.out.println(a);
	}
	
	public void buzinar() {
		System.out.println("Butt out you bitch! get your ass out of my way! BIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
	}
}
