package Ex_ContaBanco;

import java.util.Scanner;

public class Conta {
	//Author: João Vítor Souza Pioner / 03/02/21
	private String nomeTitular, agencia;
	private int numeroConta;
	private double saldo;
	private boolean aberta;
	private static int totContas;

	public Conta(String nomeTitular, String agencia, int numeroConta, double saldo) {
		this.nomeTitular = nomeTitular;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		Conta.totContas += 1;
	}
	
	public static int getTotConta() {
		return Conta.totContas;
	}
}