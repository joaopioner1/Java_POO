package veiculo;

public class Carro extends Veiculo {

	private double motor;
	private double quantPortas;
	private boolean portasAF;

	public void abrirPortas() {

		if (this.getPortasAF() == false) {
			this.setPortasAF(true);
			System.out.println("Portas abertas!");
		} else {
			System.out.println("As portas já estão abertas!");
		}
	}

	public void fecharPortas() {
		
		if (this.getPortasAF()) {
			this.setPortasAF(true);
			System.out.println("Portas fechadas!");
		} else {
			System.out.println("Portas já estão fechadas!");
		}
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	public double getQuantPortas() {
		return quantPortas;
	}

	public void setQuantPortas(double quantPortas) {
		this.quantPortas = quantPortas;
	}

	public boolean getPortasAF() {
		return portasAF;
	}

	public void setPortasAF(boolean portasAF) {
		this.portasAF = portasAF;
	}

}
