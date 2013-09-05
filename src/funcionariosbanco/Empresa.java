package funcionariosbanco;

public class Empresa {
	Funcionario[] empregados;
	String cnpj;
	private int posicao = 0;
	
	void adiciona(Funcionario f){
		this.empregados[posicao] = f;
		posicao++;
	}
	void mostraEmpregados(){
		for (int i = 0; i < this.empregados.length; i++) {
			System.out.println("Funcionario na posição: " + i );
			empregados[i].main();
		}
	}
}
