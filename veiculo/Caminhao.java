package veiculo;

public class Caminhao extends Caminhonete {

	private boolean carroceria;
	
	public void bascular () {
		if (this.getLigar()) {
			this.setCarroceria(true);
			System.out.println("Caminh�o basculando.");
		} else {
			System.out.println("Imposs�vel bascular, caminh�o desligado.");
		}
	}
	
	public void descerCarroceria() {
		
		if (this.getCarroceria() && this.getLigar()) {
			System.out.println("Descendo carroceria.");
		} else {
			System.out.println("Imposs�vel descer carroceria porque o caminh�o est� desligado ou a carroceria n�o est� levantada.");
		}
	}
	
	public boolean getCarroceria() {
		return carroceria;
	}

	public void setCarroceria(boolean carroceria) {
		this.carroceria = carroceria;
	}
	
	
}
