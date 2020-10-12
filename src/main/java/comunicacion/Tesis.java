package comunicacion;

public class Tesis extends Escrito{
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos,
			String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
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

	String getIdea() {
		return idea;
	}

	void setIdea(String idea) {
		this.idea = idea;
	}

	String[] getArgumentos() {
		return argumentos;
	}

	void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}

	String getConclusion() {
		return conclusion;
	}

	void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	String getReferencias() {
		return referencias;
	}

	void setReferencias(String referencias) {
		this.referencias = referencias;
	}

	String getInterpretacion() {
		return interpretacion;
	}

	void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	

}
