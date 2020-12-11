package Exercise_bank;

public class ContaBanco {
	// Author: Joao Vitor Souza Pioner | Data: 11/12/2020 15:39

	public int numConta;
	protected String tipo;
	private String dono;
	private boolean status;
	private int saldo;
	
	public ContaBanco(int numConta, String tipo, String dono, int saldo) {
		
		
	}
	
	public void abrirConta() {
		System.out.println("Conta aberta! Qual o tipo de conta voce deseja? ");
		this.status = true;
		
		if (this.tipo.equals("cc")) {
			this.saldo += 150;
		} else {
			this.saldo += 50;
		}
	}

	public void fecharConta() {

		if (this.saldo > 0 || this.saldo < 0) {
			this.status = true;
			System.out.println("Impossível fechar conta. Verifique se você ainda possui dinheiro no saldo ou está no débito.");
		} else {
			this.status = true;
			System.out.println("Conta fechada com sucesso!");
		}
	}

	public void depositar() {
		double x = 100.00;
		if (status == true) {
			this.saldo += x;
			System.out.println("Saldo: " + this.saldo);
		} else {
			System.out.println("Erro! Conta fechada.");
		}
	}

	public void sacar() {
		double y = 50.00;
		if (status == true && saldo >= y) {
			this.saldo -= y;
		} else {
			System.out.println("Erro! Conta fechada.");
		}
	}
	
	public void pagarMensal() {
		this.saldo -= 12;
		System.out.println("Saldo: " + this.saldo);
	}
	
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
}
