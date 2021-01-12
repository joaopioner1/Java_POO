package ckfight;

public class Luta {
	
	private boolean ativa, restrita;
	private Lutadores l1, l2;
	
	public void terminarLuta() {
		this.setAtiva(false);
	}
	
	public void comecarLuta() {
		this.setAtiva(true);
	}
	
	public void marcarLuta(Lutadores l1, Lutadores l2) {
		
	}
	
	public boolean getRestrita() {
		return restrita;
	}

	public void setRestrita(boolean restrita) {
		this.restrita = restrita;
	}

	public boolean getAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
}
