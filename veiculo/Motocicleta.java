package veiculo;

public class Motocicleta extends Veiculo {
	
	public void empinar() {
		
		if (this.getLigar()) {
			System.out.println("Empinando! Cuidado para n�o cair.");
		} else {
			System.out.println("Imposs�vel empinar, moto desligada.");
		}
	}
}
