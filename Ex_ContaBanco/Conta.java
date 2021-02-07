package Ex_ContaBanco;

import java.io.PrintStream;
import java.util.Scanner;

public class Conta {
	//Author: João Vítor Souza Pioner / 03/02/21
	private String nomeTitular, agencia, dataAbertura;
	private int numeroConta;
	private double saldo;
	private boolean aberta;

	public Conta(String nomeTitular, String agencia, String dataAbertura, int numeroConta, double saldo) {
		this.nomeTitular = nomeTitular;
		this.agencia = agencia;
		this.dataAbertura = dataAbertura;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public void abrirConta() {
		this.setAberta(true);
	}
	
	public void fecharConta() {
		if (this.getSaldo() < 0 || this.getSaldo() > 0 || this.getAberta() == false) {
			System.out.println("Impossível fechar conta, ela precisa estar aberta, e também o saldo precisa ser 0!");
		} else {
			this.setAberta(false);
			System.out.println("Conta fechada com sucesso, adeus!");
		}
	}
	
	public void sacar(double valor) {
		Scanner in = new Scanner(System.in);
		if (valor > this.getSaldo() && this.getAberta()) {
			System.out.println("Você deseja fazer um empréstimo com o banco, juros de 5% (s/n)? Você não possui saldo suficiente.");
			char resp = in.next().charAt(0);
			if (resp == 's') {
				System.out.println("Saque efetuado com sucesso! Você pegou emprestavo R$ " + (valor-this.getSaldo() + ", saldo: " + this.getSaldo()));
			} else {
				System.out.println("Ok.");
			}
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
	
	public void status() {
		System.out.println("Nome do titular: " + this.getNomeTitular());
		System.out.println("Agência: " + this.getAgencia());
		System.out.println("Número da conta: " + this.getNumeroConta());
		System.out.println("Data de criação: " + this.getDataAbertura());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.printf("Rendimento: %.2f\n", this.calculaRendimento());
		System.out.println("Aberta: " + this.getAberta());
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
