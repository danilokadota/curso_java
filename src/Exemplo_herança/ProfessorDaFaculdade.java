package Exemplo_heran�a;

public class ProfessorDaFaculdade extends EmpregadoDaFacudade {
	private int horasDeAula;
	
	double getGastos(){
		return this.getSalario() + this.horasDeAula *10;
	}
	
	String getInfo(){
		String informacaoBasica = super.getInfo();
		String informacao = informacaoBasica + " horas de aula: " + this.horasDeAula;
		return informacao;
	}

	public int getHorasDeAula() {
		return horasDeAula;
	}

	public void setHorasDeAula(int horasDeAula) {
		this.horasDeAula = horasDeAula;
	}
	
}
