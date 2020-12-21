package class10;

public class MainClass {

	public static void main(String[] args) {
		// Autor: Joao vitor Souza Pioner date: 21/12/2020 9:49
		
		Pessoa p[] = new Pessoa[3];
		p[0] = new Aluno();
		p[1] = new Professor();
		p[2] = new Funcionario();
		
		p[0].fazerAniver();
		System.out.println(p[0].getIdade());
	}
}
