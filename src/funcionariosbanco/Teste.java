package funcionariosbanco;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Teste {

	public static void main(String[] args) {
		Empregados f1 = new Empregados();
	
		f1.setNome("Danilo");
		f1.setSobreNome("Kadota");
		f1.setDepartamento("backend");
		f1.setSalario(1500);
		f1.setDataDeEntrada("26/07/2013");
		f1.setRg("42.194.427-4");
		f1.calculaGanhoAnual();
		f1.recebeAumento(500);
		
		
		Empregados f2 = new Empregados();
		
		f2.setNome("Ana");
		f2.setSobreNome("Almeida");
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
			
		System.out.println("Bonificação: " + f1.getNome() +" " + f1.getSobreNome() + " "+ f1.getBonificacao());
		 

			Gerente gerente1 = new Gerente();
			gerente1.setNome("danilo kadota");
			gerente1.setSenha(120303);
			gerente1.setSalario(5000);
			
			System.out.println("Bonificação: " + gerente1.getBonificacao() + " de " + gerente1.getSalario());
			
			Gerente g = new Gerente();
			g.setNome("marcus");
			
			Empregados e = new Empregados();
			e.setNome("marcus");
			
			System.out.println(g.getNome() + " // " + e.getNome());
			
			Set<String> conjunto = new HashSet<>();
			conjunto.add("item1");
			conjunto.add("item2");
			conjunto.add("item3");
			
			java.util.Iterator <String> i = conjunto.iterator();
			while (i.hasNext()){
				String palavra = i.next();
				System.out.println(palavra);
			}
			
			ContaCorrente c1 = new ContaCorrente();
			c1.deposita(1000);
			
			ContaCorrente c2 = new ContaCorrente();
			c2.deposita(3000);

			HashMap<String,ContaCorrente> mapaDeContas = new HashMap<>();
			
			mapaDeContas.put("diretor",c1);
			mapaDeContas.put("gerente", c2);
			
			ContaCorrente contaDoDiretor = mapaDeContas.get("diretor");
			System.out.println(contaDoDiretor.getSaldo());
	}		
		
}
