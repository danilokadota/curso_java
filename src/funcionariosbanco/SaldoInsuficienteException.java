package funcionariosbanco;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends RuntimeException {
	SaldoInsuficienteException(String message){
		super(message);
	}

}
