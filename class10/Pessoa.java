package class10;

public class Pessoa {
	// Autor: Joao vitor Souza Pioner date: 21/12/2020 9:49
	
	private String nome;
	private String sexo;
	private int idade;
	
	public int fazerAniver() {
		return setIdade(this.getIdade() + 1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public int setIdade(int idade) {
		return this.idade = idade;
	}
	
	
}
