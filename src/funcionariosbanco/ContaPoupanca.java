package funcionariosbanco;


public class ContaPoupanca extends Conta {
	@Override
	public void atualiza(double taxa){
		this.deposita( getSaldo() * taxa * 3);
	}
}
