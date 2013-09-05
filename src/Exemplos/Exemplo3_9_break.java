package Exemplos;

public class Exemplo3_9_break {

	public static void main(String[] args) {
		int x = 2;
		int y = 100;
		for (int i = x; i < y; i++) {
			  if (i % 19 == 0) {
			    System.out.println("Achei um número divisível por 19 entre " + x + " e " + y);
			    break;
			  }
			}
		for (int i = 0; i < 100; i++) {
			  if (i > 50 && i < 60) {
			    continue;
			  }
			  System.out.println(i);
			}
	}

}
