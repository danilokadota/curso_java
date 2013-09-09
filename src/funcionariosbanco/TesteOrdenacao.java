package funcionariosbanco;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TesteOrdenacao {

	public static void main(String[] args) {
		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();
		
		for (int i = 0; i < 20; i++) {
		ContaPoupanca c = new ContaPoupanca();
		c.setNomeDoCliente(null);
		contas.add(c);	
		}
		
		Collections.sort(contas);
		
		for (int i = 0; i < contas.size(); i++) {
			Conta atual = contas.get(i);
			System.out.println("numero: " + atual.getNumero());
		}
	}

}
