package comunicacion;

public class Alfabeto extends Pictograma{
	
	String[] letras;
	String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion){
		super(origen);
		this.letras = letras;
	}
	
	public String toString(){
		String cadena = "";
		for(String letra : letras){
			cadena += (String) letra + (String) ", "; 
		}
		return cadena;
		}
	
	public int cantidadLetras(){
		return letras.length;
	}
	public String interpretacion(){
		return null;
		}

	public String[] getLetras() {
		return letras;
	}

	public  void setLetras(String[] letras) {
		this.letras = letras;
	}
}
