package strategy;

public class CalculoImpostoVinteOuQuinze implements CalculaImposto {

	@Override
	public double calculaSalarioComImposto(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 3500) {
			return funcionario.getSalarioBase() * 0.8;
		}
		return funcionario.getSalarioBase() * 0.85;
	}

}
