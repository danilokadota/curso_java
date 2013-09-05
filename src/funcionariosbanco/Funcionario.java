package funcionariosbanco;

public class Funcionario {
		private String nome;
		private String departamento;
		private double salario;
		private String dataDeEntrada;
		private String rg;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDepartamento() {
			return departamento;
		}
		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		public String getDataDeEntrada() {
			return dataDeEntrada;
		}
		public void setDataDeEntrada(String dataDeEntrada) {
			this.dataDeEntrada = dataDeEntrada;
		}
		public String getRg() {
			return rg;
		}
		public void setRg(String rg) {
			this.rg = rg;
		}
		void recebeAumento(double aumento){
			salario += aumento;
		}
		double calculaGanhoAnual(){
			return salario*12;
		}
		void main(){
			System.out.println("Nome: " + this.nome);
			System.out.println("Departamento: "+ this.departamento);
			System.out.println("Salario: "+ this.salario);
			System.out.println("Data de entrada: "+ this.dataDeEntrada);
			System.out.println("RG: " + this.rg);
			System.out.println("Ganho anual: " + calculaGanhoAnual());
			
		}
	}
	
	
