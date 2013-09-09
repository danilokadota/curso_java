package funcionariosbanco;

import java.io.FileNotFoundException;

public class TesteErro {
	public static void main(String[] args) {
		System.out.println("inicio do main");
		metodo1();
		System.out.println("fim do main");
	}
	
	public static void metodo1(){
		System.out.println("inicio do main1");
		try{
		metodo2();
		}catch (ArrayIndexOutOfBoundsException e){
			
			System.out.println("erro: "+ e);
		}
		System.out.println("fim do main1");
	}
	public static void metodo2() {
		System.out.println("inicio do main2");
		int [] array = new int [10];
		
		for (int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);
		}
		
		System.out.println("fim do main2");
	}
	public static void metodo()  {
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
