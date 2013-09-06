package funcionariosbanco;

public class Diretor extends Funcionario implements Autenticavel {
	private int senha;

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
