package class10;

public class Professor extends Pessoa {
	
	private String especialidade;
	private double salario;
	
	public double receberAum() {
		return this.setSalario(this.getSalario() + 100);
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public double setSalario(double salario) {
		return this.salario = salario;
	}
}
