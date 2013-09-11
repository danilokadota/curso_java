package funcionariosbanco;

import java.util.ArrayList;
import java.util.Collection;

public class Desafiohascode {

	public static void  main (String[] args) {
		Collection<Integer> teste = new ArrayList<>();
		
		for (int i = 1000; i >= 0; i--) {
			teste.add(i);
			System.out.println(i);
		}
		
	}

}
