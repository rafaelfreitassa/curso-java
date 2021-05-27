package entities;

public class Aluno {
	
	public String name;
	public double nota1, nota2, nota3;
	
	public double total() {
		return nota1 + nota2 + nota3;
	}
	
	public double pontosFaltantes() {
		if (total() < 60.0) {
			return 60.0 - total();
		}
		else {
			return 0.0;
		}
	}

}
