package exercise_pessoa;

public class MainClass {

	public static void main(String[] args) {
		
		Livro liv[] = new Livro[2];
		Pessoa p[] = new Pessoa[2];
		
		p[0] = new Pessoa("Joao", "Masculino", 23);
		liv[0] = new Livro("Abra", "Joao", 200, 183, p[0]);
		
		liv[0].detalhes(p[0]);
		liv[0].abrir();
		liv[0].avancarPag();
		liv[0].detalhes(p[0]);
	}

}
