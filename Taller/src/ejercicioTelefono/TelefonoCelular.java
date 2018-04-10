package ejercicioTelefono;

import java.util.ArrayList;

public class TelefonoCelular extends Telefono {

	private String sistemaOperativo;
	private String nombre;
	private ArrayList<String> lista = new ArrayList<String>(); 
	
	public TelefonoCelular(int agenda, int numero, String operadora, String sistemaOperativo, String nombre) {
		super( numero, operadora);
		this.sistemaOperativo = sistemaOperativo;
		this.nombre = nombre;
	}

	
	public ArrayList<String> agenda(String numero) {
		
		if (numero != null){
		
			lista.add(numero);
		}
		
		return lista;
		
		
	}
	
	public void mostrarAgenda(){
		
		for(int i = 0; i < lista.size() ; i++){
			if (lista.size()>0){
				System.out.println("Los numero de la agenda son: " + lista.get(i));
			continue;
			}
			System.out.println("Lista vacia");
		}

		
	}
	
	
	
	
	/*---------------------------------*/
	
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
