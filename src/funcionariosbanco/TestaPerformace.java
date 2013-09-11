package funcionariosbanco;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformace {

	public static void main(String[] args) {
		System.out.println("iniciando...");
		long inicio = System.currentTimeMillis();
		Collection<Integer> teste = new HashSet<>();
		
		int total = 30000;
		
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("tempo gasto: " + tempo);
	}

}
