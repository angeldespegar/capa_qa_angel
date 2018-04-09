package interfaces;

public class Animal implements SerVivo{

	private String tipo;
	private String nombre;
	
	
	
	public Animal(String tipo, String nombre) {
		this.tipo = tipo;
		this.nombre = nombre;
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caminar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String queCome(String alimentos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int edad() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void dormir(double tiempo) {
		// TODO Auto-generated method stub
		
	}

	
}
