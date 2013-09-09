package funcionariosbanco;


public  class Conta {
	int numero;
	String dono;
	String cpf ;
	double saldo;
	double limite;
	double salario;
	
	
	
	public void deposita(double valor){
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {

		this.saldo += valor - 0.10;
		}
	}
	void saca(double valor){
		if (this.saldo < valor) {
		throw new SaldoInsuficienteException("saldo insuficiente" + "tente um valor menor");
	} else {
		this.saldo -= valor;
	}
}
	public double getSaldo(){
		return this.saldo;
	}
	void atualiza(double taxa){
		this.saldo =+ this.saldo * taxa;
	}
	

	void transfere (Conta destino, double valor){
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
