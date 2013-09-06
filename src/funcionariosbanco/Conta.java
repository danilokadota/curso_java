package funcionariosbanco;


public class Conta {
	int numero = 1234;
	String dono = "Danilo";
	String cpf = "123.456.789-10";
	double saldo = 1000;
	double limite = 1000;
	double salario;
	
	public void deposita(double quantidade){
		this.saldo += quantidade;
	}
	boolean  saca(double quantidade){
		if (quantidade > this.saldo + this.limite) {
			System.out.println("Não posso sacar fora do limite! ");
			return false;
		} else {
			this.saldo = this.saldo - quantidade;
			return true;
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
