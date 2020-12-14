package exercise_cliente_supermercado;

public class Cliente_Supermercado {
	//Author: Joao Vitor Souza Pioner | Date: 14/12/2020 9:47
	
	protected String nome;
	public char sexo;
	public int idade;
	private boolean devedor;
	private boolean credito;
	
	public Cliente_Supermercado(int idade, char sexo, String nome) {
		
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setNome(nome);
	}
	
	public void verificaStatus() {
		
		if (this.getDevedor() == true) {
			this.setCredito(false);
		} else {
			this.setCredito(true);
			this.setDevedor(false);
		}
	}
	
	public void compra() {
		
		if (this.getCredito() == true) {
			System.out.println("Compra realizada com sucesso!");
		} else {
			System.out.println("Não é possível realizar a compra! Você está devendo.");
		}
	}
	
	public void apagarCliente() {
		
		if (this.getDevedor() == false && this.getCredito() == false ) {
			this.setIdade(0);
			this.setSexo('0');
			this.setNome("");
			this.setCredito(false);
			this.setDevedor(false); //apgar o false pra ver o que acontece
		} else {
			System.out.println("Impossível apagar clinte! Ele possui crédito ou está devendo.");
		}
	}
	
	public void mostraInformacoes() {
		
		System.out.println("-----CLIENTE-----");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Devedor: " + this.getDevedor());
		System.out.println("Crédito: " + this.getCredito());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int i) {
		this.idade = i;
	}

	public boolean getDevedor() {
		return devedor;
	}

	public void setDevedor(boolean devedor) {
		this.devedor = devedor;
	}

	public boolean getCredito() {
		return credito;
	}

	public void setCredito(boolean credito) {
		this.credito = credito;
	}
}
