package ckfight;

public class Luta {
	
	private boolean ativa, restrita, aprovada;
	private Lutadores desafiante, desafiado;
	
	public void terminarLuta() {
		this.setAtiva(false);
	}
	
	public void comecarLuta() {
		this.setAtiva(true);
	}
	
	public void marcarLuta(Lutadores l1, Lutadores l2) {
		if (l1.getClassificado() == true && l2.getClassificado() && l1.getVivo() == true & l2.getVivo() == true) {
			this.setAprovada(true);
			this.desafiado = l2;
			this.desafiante = l2;
		} else {
			this.setAprovada(false);
			this.desafiado = null;
			this.desafiante = null;
		}
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

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
}
