package exercise_veiculo;

public class Cliente_Veiculo implements Funcoes {
	// Author: João Vítor Souza Pioner | Date: 15/12/2020 10:49

	private String nome;
	private int idade;
	private int cpf;
	private int telefone;
	private double saldo;
	private double precoTotal;
	private double precoAluguel;
	private double deposito;
	private boolean contaCriada;
	private boolean comprouOuAlugou;

	public Cliente_Veiculo(String nome, int idade, int cpf, int telefone, double saldo) { // Construtor

		this.setIdade(idade);
		this.setCpf(cpf);
		this.setNome(nome);
		this.setSaldo(saldo);
		this.setTelefone(telefone);
	}

	@Override
	public void criarConta() {

		this.setContaCriada(true);
		System.out.println("Conta criada com sucesso!!");
	}

	@Override
	public void fecharConta() {

		if (this.getContaCriada() && this.getSaldo() == 0 && this.getComprouOuAlugou() == false) {
			this.setContaCriada(false);
			System.out.println("Conta apagada!!!");
		} else {
			System.out.println("Impossível apagar a conta! Isso ocorreu por 3 motivos: "
					+ "você não criou uma conta, você possui/não saldo na conta ou você está com algum veículo alugado ou comprou um.");
		}
	}

	@Override
	public void alugar() {

		if (this.getContaCriada()) {
			if (this.getIdade() >= 18 && this.getSaldo() >= this.getPrecoAluguel()) {
				this.setComprouOuAlugou(true);
				System.out.println("Aluguel efetuado com sucesso. Aproveite!");
				this.setSaldo(this.getSaldo() - this.getPrecoAluguel());
				System.out.println("Saldo: " + this.getSaldo());
			} else {
				System.out.println("Você é menor de idade ou não possui dinheiro suficiente no saldo; "
						+ "se for o caso, deposite R$ " + (this.getPrecoAluguel() - this.getSaldo())
						+ " no seu saldo.");
			}
		}
	}

	@Override
	public void comprar() {
		
		if (this.getContaCriada() && this.getSaldo() >= this.getPrecoTotal() && this.getIdade() >= 18) {
				this.setComprouOuAlugou(true);
				System.out.println("Compra efetuada com sucesso!!");
				this.setSaldo(this.getSaldo() - this.getPrecoTotal());
				System.out.println("Saldo: R$ " + this.getSaldo());
		} else {
			System.out.println("Você é menor de idade ou não possui dinheiro suficiente no saldo; "
			+ "se for o caso, deposite R$ " + (this.getPrecoTotal() - this.getSaldo()) + " no seu saldo.");
		}
	}

	@Override
	public void depositar() {

		if (this.getContaCriada() == true) {
			this.setSaldo(this.getSaldo() + this.getDeposito());
			System.out.println("Dinheiro entrou na conta! Saldo: R$ " + this.getSaldo());
		} else {
			System.out.println("Impossível depositar!");
		}
	}

	@Override
	public void dadosCliente() {

		System.out.println("----Dados do cliente---");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Possui aluguel ou comprou? " + this.getComprouOuAlugou());
		System.out.println("-----------------------");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public double getPrecoAluguel() {
		return precoAluguel;
	}

	public void setPrecoAluguel(double precoAluguel) {
		this.precoAluguel = precoAluguel;
	}

	public boolean getContaCriada() {
		return contaCriada;
	}

	public void setContaCriada(boolean contaCriada) {
		this.contaCriada = contaCriada;
	}

	public boolean getComprouOuAlugou() {
		return comprouOuAlugou;
	}

	public void setComprouOuAlugou(boolean comprouOuAlugou) {
		this.comprouOuAlugou = comprouOuAlugou;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

}
