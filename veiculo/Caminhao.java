package veiculo;

public class Caminhao extends Caminhonete {

	private boolean carroceria;
	
	public void bascular () {
		if (this.getLigar()) {
			this.setCarroceria(true);
			System.out.println("Caminhão basculando.");
		} else {
			System.out.println("Impossível bascular, caminhão desligado.");
		}
	}
	
	public void descerCarroceria() {
		
		if (this.getCarroceria() && this.getLigar()) {
			System.out.println("Descendo carroceria.");
		} else {
			System.out.println("Impossível descer carroceria porque o caminhão está desligado ou a carroceria não está levantada.");
		}
	}
	
	public boolean getCarroceria() {
		return carroceria;
	}

	public void setCarroceria(boolean carroceria) {
		this.carroceria = carroceria;
	}
	
	
}
