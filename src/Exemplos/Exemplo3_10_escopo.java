package Exemplos;

public class Exemplo3_10_escopo {

	public static void main(String[] args) {
		int i;
		if (true) {
		  i = 5;
		} 
		else {
		  i = 10;
		}
		System.out.println(i);

	}
	
}
