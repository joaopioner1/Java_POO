package exercise_cliente_supermercado;

public class Cliente_Supermercado {
	//Author: Joao Vitor Souza Pioner | Date: 14/12/2020 9:47
	
	protected String nome;
	public char sexo;
	public short idade;
	private boolean devedor;
	private boolean credito;
	
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
		}
	}
	
	public void apagarCliente() {
		
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

	public short getIdade() {
		return idade;
	}

	public void setIdade(short idade) {
		this.idade = idade;
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
