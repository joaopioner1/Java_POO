package ckfight;

import java.util.Scanner;

public class Luta {

	private boolean restrita, aprovada, lutando;
	private Lutadores desafiante, desafiado;

	/*public void terminarLuta() {
		this.setAtiva(false);
	}*/

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

	public void restringir() {
		Scanner input = new Scanner(System.in);

		if (this.getAprovada() && this.getLutando() == false) {

			System.out.print("ALERTA! Restringir a luta ira impedir os lutadores de usarem poderes especiais. Continuar(s/n)? ");
			char confirm = input.next().charAt(0);

			if (confirm == 's') {
				this.setRestrita(true);
				this.desafiante.setEspecial(null);
				this.desafiado.setEspecial(null);
			} else {
				System.out.println("OK, luta não restrita.");
			}
		} else {
			System.out.println("É preciso marcar/não estar ativa uma luta para restringir a mesma.");
		}
	}
	
	public void lutar() {
		if (this.getAprovada()) {
			
		} else {
			System.out.println("A luta não pode ocorrer porque a mesma não foi marcada.");
		}
		
	}

	public boolean getRestrita() {
		return restrita;
	}

	public void setRestrita(boolean restrita) {
		this.restrita = restrita;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	public boolean getLutando() {
		return lutando;
	}

	public void setLutando(boolean lutando) {
		this.lutando = lutando;
	}
}
