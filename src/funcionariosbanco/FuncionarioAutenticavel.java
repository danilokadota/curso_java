package funcionariosbanco;

public class FuncionarioAutenticavel {
	int senha;
	public boolean autentica(int senha){
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
}
