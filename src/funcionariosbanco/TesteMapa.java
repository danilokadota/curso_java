package funcionariosbanco;

import java.util.HashMap;

public class TesteMapa {

	public static void main(String[] args)  {
		ContaCorrente c1 = new ContaCorrente();
		c1.deposita(10000);
		
		ContaCorrente c2 = new ContaCorrente();
		c2.deposita(3000);
		
		java.util.Map<String,ContaCorrente> mapaDeContas = new HashMap<>();
		
		mapaDeContas.put("diretor",c1);
		mapaDeContas.put("gerente",c2);
		
		Conta contaDoDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
		
	}
}
