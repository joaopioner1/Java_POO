package class14;

public class Gafanhoto extends Pessoa {
	
	private String login;
	private int totAssistido;
	
	
	public Gafanhoto(String nome, String sexo, int idade, String login, int totAssistido) {
		super(nome, sexo, idade);
		this.login = login;
		this.totAssistido = totAssistido;
	}

	public void viuMaisUM() {
		this.setTotAssistido(this.getTotAssistido() + 1);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	@Override
	public void ganharExp() {
		// TODO Auto-generated method stub
		
	}
}
