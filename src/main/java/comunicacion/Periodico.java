package comunicacion;

public class Periodico extends Escrito{

	private String fecha;
	private String primicia;
	private String interpretacion;
	
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia,
			String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	@Override
	int palabrasTotales(int palabrasPagina) {
		return palabrasPagina*this.getPaginas();
	}

	@Override
	String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	String getFecha() {
		return fecha;
	}

	void setFecha(String fecha) {
		this.fecha = fecha;
	}

	String getPrimicia() {
		return primicia;
	}

	void setPrimicia(String primicia) {
		this.primicia = primicia;
	}

	String getInterpretacion() {
		return interpretacion;
	}

	void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	
}
