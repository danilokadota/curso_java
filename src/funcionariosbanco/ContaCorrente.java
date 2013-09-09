package funcionariosbanco;


public class ContaCorrente extends Conta implements Comparable<ContaCorrente>, Tributavel {
	@Override
	public void atualiza(double taxa){
	this.saldo =+ this.saldo * taxa * 2;
	}
	@Override
	public void deposita(double valor){
		this.saldo += valor - 0.10;
	}
	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
	@Override
	public int compareTo(ContaCorrente outra) {
		if (this.saldo < outra.saldo) {
			return -1;
			
		}
		if (this.saldo > this.saldo) {
			return 1;
			
		}
		return 0;
	}
}
