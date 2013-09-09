package funcionariosbanco;


public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {
	private String nomeDoCliente;
	
	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	@Override
	public void atualiza(double taxa){
		this.deposita( getSaldo() * taxa * 3);
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		if (this.getNumero() < o.getNumero()) {
			return -1;
			
		}
		if (this.getNumero() > this.getNumero()) {
			return 1;
			
		}
		return 0;
	}
}
