package class10;

public class Aluno extends Pessoa{
	
	private boolean matricula;
	private String curso;
	
	public void cancelarMat() {
		this.setMatricula(false);
	}
	
	public boolean getMatricula() {
		return matricula;
	}
	
	public void setMatricula(boolean matricula) {
		this.matricula = matricula;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
}
