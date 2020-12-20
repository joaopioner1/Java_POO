package exercise_pessoa;

public class Livro implements Publicacao {
	// Autor: Joao vitor Souza Pioner date: 19/12/2020 17:03
	private String titulo;
	private String autor;
	private int totalPag;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro(String titulo, String autor, int totalPag, int pagAtual, Pessoa leitor) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setTotalPag(totalPag);
		this.setPagAtual(pagAtual);
		this.leitor = leitor;
	}

	public void detalhes(Pessoa nome) {
		System.out.println("=-=-=-DETALHES LIVRO-=-=-=");
		System.out.println("Título: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total da páginas: " + this.getTotalPag());
		System.out.println("Página atual: " + this.getPagAtual());
		System.out.println("Está aberto? " + this.getAberto());
		System.out.println("Leitor: " + nome.getNome());
	}

	@Override
	public void abrir() {
		if (!this.getAberto()) {
			this.setAberto(true);
		} else {
			System.out.println("Impossível abrir, pois o livro já está aberto!");
		}
	}

	@Override
	public void fechar() {
		if (this.getAberto()) {
			this.setAberto(false);
		} else {
			System.out.println("Impossível fechar, pois o livro já está fechado!");
		}
	}

	@Override
	public void folhear() {
		if (this.getAberto()) {
			this.setPagAtual(this.getPagAtual() + 10);
		} else {
			System.out.println("Livro fechado, sendo assim impossível usar.");
		}
	}

	@Override
	public void avancarPag() {
		if (this.getAberto()) {
			this.setPagAtual(this.getPagAtual() + 1);
		} else {
			System.out.println("Livro fechado, sendo assim impossível usar.");
		}
	}

	@Override
	public void voltarPag() {
		if (this.getAberto()) {
			this.setPagAtual(this.getPagAtual() - 1);
		} else {
			System.out.println("Livro fechado, sendo assim impossível usar.");
		}
	}

	// getters and setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalPag() {
		return totalPag;
	}

	public void setTotalPag(int totalPag) {
		this.totalPag = totalPag;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

}
