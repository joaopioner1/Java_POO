package ultraemojicombat;

public class Luta {

	private Lutador desafiado, desafiante; // tipos abstratos de dados
	private int rounds;
	private boolean aprovada;

	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2 && l1.getIdade() < 60 && l2.getIdade() < 60) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}

	public void lutar() {
		if (this.aprovada) {
			System.out.println("++ DESAFIADO ++");
			this.desafiado.apresentar();
			System.out.println("\n++ DESAFIANTE ++");
			this.desafiante.apresentar();

			int pontosA = 0, pontosB = 0;
			
			if (this.desafiado.getIdade() >= 30 && this.desafiado.getIdade() <= 45) {
				pontosA += 1;
			} else {
				pontosA -= 1;
			} if (this.desafiado.getPeso() >= 80 && this.desafiado.getPeso() <= 100) {
				pontosA += 1;
			} else {
				pontosA -= 1;
			} if (this.desafiado.getVitorias() >= 18 && this.desafiado.getDerrotas() <= 4 && this.desafiado.getEmpates() <= 5) {
				pontosA += 2;
			} else {
				pontosB -= 1;
			} if (this.desafiante.getIdade() >= 30 && this.desafiante.getIdade() <= 45) {
				pontosB += 1;
			} else {
				pontosB -= 1;
			} if (this.desafiante.getPeso() >= 80 && this.desafiante.getPeso() <= 100) {
				pontosB += 1;
			} else {
				pontosB -= 1;
			} if (this.desafiante.getVitorias() >= 18 && this.desafiante.getDerrotas() <= 4 && this.desafiante.getEmpates() <= 5) {
				pontosB += 2;
			} else {
				pontosB -= 1;
			}

			System.out.println("\n@@@ RESULTADO DA LUTA @@@");
			if (pontosA > pontosB) {
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				System.out.println("Ganhador: " + this.desafiado.getNome());
				System.out.println("Pontos " + this.desafiado.getNome() + ": " + pontosA);
				System.out.println("Pontos " + this.desafiante.getNome() + ": " + pontosB);
			} else if (pontosB > pontosA) {
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				System.out.println("Ganhador: " + this.desafiante.getNome());
				System.out.println("Pontos " + this.desafiado.getNome() + ": " + pontosA);
				System.out.println("Pontos " + this.desafiante.getNome() + ": " + pontosB);
			} else {
				
			}

		} else {
			System.out.println("Luta não aprovada!");
		}
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}
