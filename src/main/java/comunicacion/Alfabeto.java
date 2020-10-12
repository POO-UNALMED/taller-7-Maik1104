package comunicacion;

public class Alfabeto extends Pictograma{

	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}

	private String[] letras;
	private String interpretacion;
	
	public int cantidadLetras() {
		return letras.length;
	}

	public String interpretacion() {
		return interpretacion;
	}

	public String toString() {
		String a = letras[0]+", ";
		for (int i = 1; i<letras.length-1; i++) {
			a = a + letras[i] + ", ";
		}
		return a+letras[letras.length-1];
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	
}
