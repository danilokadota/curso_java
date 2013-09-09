package funcionariosbanco;

public class TestandoReferenciaNula {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Conta c = null;
		System.out.println("saldo atual " + c.getSalario());

	}

}
