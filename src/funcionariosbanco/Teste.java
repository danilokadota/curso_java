package funcionariosbanco;

public class Teste {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
	
		f1.setNome("kadota");
		f1.setDepartamento("backend");
		f1.setSalario(1500);
		f1.setDataDeEntrada("26/07/2013");
		f1.setRg("42.194.427-4");
		f1.calculaGanhoAnual();
		f1.recebeAumento(500);
		
		
		Funcionario f2 = new Funcionario();
		
		f2.setNome("danilo");
		f2.setDepartamento("frontend");
		f2.setSalario(1500);
		f2.setDataDeEntrada("26/07/2013");
		f2.setRg("42.194.327-4");
		f2.calculaGanhoAnual();
		f2.recebeAumento(500);
	
		
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[2];
		empresa.adiciona(f1);
		empresa.adiciona(f2);
		empresa.mostraEmpregados();

	}

}
