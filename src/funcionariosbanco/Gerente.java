package funcionariosbanco;

public class Gerente extends Funcionario implements Autenticavel {
	int numeroDeFuncionariosGerenciados;
	private int senha;
	@Override
	public double getBonificacao(){
		return super.getBonificacao() + 500;
	}
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	@Override
	public boolean autentica(int senha){
		if (this.senha != senha) {
			return false;
		}
		return true;
	}
}
