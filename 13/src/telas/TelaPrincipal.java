package telas;

import pessoas.Funcionario;
import pessoas.Medico;
import pessoas.Paciente;

public class TelaPrincipal {
	public static void main(String[] args) {
		Medico medico1 = new Medico(true);
		Funcionario funcionario1 = new Funcionario(true, "Felipe");
		Paciente paciente1 = new Paciente();
		
		medico1.showGraduation();
		funcionario1.showFuncionario();
		paciente1.fala();
		
		
		System.out.println("Tela Principal");
	}
}