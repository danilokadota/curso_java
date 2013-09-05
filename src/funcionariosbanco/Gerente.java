package funcionariosbanco;

public class Gerente extends Funcionario{
	int senha;
	int numeroDeFuncionariosGerenciados;
	
	@Override
	public double getBonificacao(){
		return super.getBonificacao() + 500;
	}
	public boolean autentica(int senha){
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	public static void main(String[]args){
		Gerente gerente1 = new Gerente();
		gerente1.setNome("danilo kadota");
		gerente1.setSenha(120303);
		gerente1.setSalario(5000);
		
		System.out.println("Bonificação: " + gerente1.getBonificacao() + " de " + gerente1.getSalario());
	}
}
