package Ex_ContaBanco;

public class Conta {

	private String nomeTitular, agencia, dataAbertura;
	private int numeroConta;
	private double saldo;
	private boolean aberta;

	public void sacar(double valor) {
		if (valor > this.getSaldo() && this.getAberta()) {
			System.out.println("Impossível efetuar saque. Seu saldo é insuficiente.");
		} else {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque efetuado com sucesso! Seu saldo: R$ " + this.getSaldo());
		}
	}
	
	public void depositar(double valor) {
		if (this.getAberta()) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Depósito feito com sucesso! Seu saldo: R$ " + this.getSaldo());
		} else {
			System.out.println("Impossível depositar, primeiro você terá de abrir uma conta.");
		}
	}
	
	public double calculaRendimento() {
		double rendimento = ((1.5 * this.getSaldo()) / 100);
		return rendimento;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
}
