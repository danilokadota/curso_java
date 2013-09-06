package funcionariosbanco;


public class AtualizadorDeContas {

		private double saldoTotal = 0;
		private final double selic;
		
		public AtualizadorDeContas (double selic){
			this.selic = selic;
		}
		
		public void roda(Conta c){
			System.out.println(c.getSaldo());
			c.deposita(9000);
			c.atualiza(0.01);
			this.saldoTotal += c.saldo; 
		}

		public double getSaldoTotal() {
			return saldoTotal;
		}

		public double getSelic() {
			return selic;
		}



}
