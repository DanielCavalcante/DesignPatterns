package strategy;

public class App {
	
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario(Funcionario.DESENVOLVEDOR,
				2100);
		System.out.println(funcionario.calcularSalarioComImposto());
		
		Funcionario outroFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR,
				1700);
		System.out.println(outroFuncionario.calcularSalarioComImposto());
	}

}
