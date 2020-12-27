package veiculo;

public class Motocicleta extends Veiculo {
	
	public void empinar() {
		
		if (this.getLigar()) {
			System.out.println("Empinando! Cuidado para não cair.");
		} else {
			System.out.println("Impossível empinar, moto desligada.");
		}
	}
}
