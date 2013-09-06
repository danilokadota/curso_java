package funcionariosbanco;

public class Empregados extends Funcionario {
	
	@Override
	public String getNome() {
		String nome = super.getNome() + " Empregado";
		return nome;
	}
}
