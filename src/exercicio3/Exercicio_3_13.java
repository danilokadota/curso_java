package exercicio3;

public class Exercicio_3_13 {

	public static void main(String[] args) {
		for (int n = 0; n <= 300; n++) {
			if(n>=150){
			System.out.println(n);
		}

	}
		int resultado = 0;
		for (int n = 0; n <=1000; n++) {
			resultado += n;
		}
		System.out.println(resultado);
		
		for (int n = 1; n <= 100; n++) {
			if(n%3 == 0){
			System.out.println(n);
			}
		}		
		int fatorial = 1;
		for (int i = 1; i <= 10; i++) {
			fatorial = (fatorial)*i;
		}
		System.out.println(fatorial);
}
}
