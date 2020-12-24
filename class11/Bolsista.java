package class11;

public class Bolsista extends Aluno {
	
	private int bolsa;
	
	public final void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome());
	}
	
	@Override
	public void pagarMensal() {
		System.out.println(this.getNome() + " é bolsista! Pagamento diminuido.");
	}
	
	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
}
