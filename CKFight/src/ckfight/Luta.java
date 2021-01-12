package ckfight;

public class Luta {
	
	private boolean ativa;
	 
	public void terminar() {
		this.setAtiva(false);
	}
	
	public void comecar() {
		this.setAtiva(true);
	}
	
	public boolean getAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
}
