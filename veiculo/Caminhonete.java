package veiculo;

public class Caminhonete extends Carro {
	
	private boolean carga;
	
	public void carregar() {
		
		this.setCarga(true);
		System.out.println("Caminhonete carregada!");
	}
	
	public void descarregar() {
		
		if (this.getCarga()) {
			System.out.println("Caminhonete descarregada!");
		}
	}
	
	public boolean getCarga() {
		return carga;
	}

	public void setCarga(boolean carga) {
		this.carga = carga;
	}
	
	
}
