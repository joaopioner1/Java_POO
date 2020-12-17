package ultraemojicombat;

public class Lutador {
	
	private String nome, nacionalidade, categoria;
	private int idade, derrotas, empates, vitorias;
	private float altura, peso;
	
	
	//Construtor
	public Lutador(String nome, String nacionalidade, int idade, int derrotas, int empates, int vitorias, float altura, float peso) {
		
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setPeso(peso);
		this.setAltura(altura);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
		this.setVitorias(vitorias);
	}

	public void apresentar() {
		System.out.println("----------------------------------------------");
		System.out.println("CHEGOU A HORA!! Apresentamos o lutador: " + this.getNome());
		System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + "m de altura");
		System.out.println("pesando: " + this.getPeso() + "Kg");
		System.out.println(this.getVitorias() + " vitórias");
		System.out.println(this.getDerrotas() + " derrotas e ");
		System.out.println(this.getEmpates() + " empates!");
	}
	
	public void status() {
		System.out.println("###########################");
		System.out.println(this.getNome() + " é um peso " + this.getCategoria());
		System.out.println("Ganhou: " + this.getVitorias() + " vezes");
		System.out.println("Derrotado: " + this.getDerrotas() + " vezes");
		System.out.println("Empatou: " + this.getEmpates() + " vezes");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() +1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() +1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

	//getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		if (this.getPeso() < 52.2) {
			this.categoria = "Inválido";
		} else if (this.getPeso() <= 70.3) {
			this.categoria = "Leve";
		} else if (this.getPeso() <= 83.9) {
			this.categoria = "Médio";
		} else if (this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	
}
