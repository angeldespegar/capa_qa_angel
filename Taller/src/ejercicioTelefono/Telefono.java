package ejercicioTelefono;


public abstract class Telefono {

	protected int agenda;
	protected int numero;
	
	protected String operadora;
	
	public Telefono(int numero, String operadora) {
		
		this.numero = numero;
		
		this.operadora = operadora;
	}

	
	public Telefono() {
		
	}
	
	
	
	
	
	
	/*---------------------------------*/
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}


	

	

}
