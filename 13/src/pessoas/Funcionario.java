package pessoas;

public class Funcionario {
	boolean isCLT;
	String name;

	public Funcionario(boolean isCLT, String name) {
		this.isCLT = isCLT;
		this.name = name;
	}

	public void showFuncionario() {
		System.out.println(this.isCLT + " " + this.name);
	}
		

}