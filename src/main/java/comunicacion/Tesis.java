package comunicacion;

public class Tesis extends Escrito{
	String idea;
	static String[] argumentos;
	String conclusion;
	String referencias;
	String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion){
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		Tesis.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int numero){
		return numero*5*getPaginas();
	}
	
	public String interpretacion(){
		return null;
	}
	
	public String toString(){
		return null;
	}
}
