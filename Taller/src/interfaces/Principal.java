package interfaces;

public class Principal {

	public static void main (String[] args){
		Persona persona = new Persona("Angel Fernandez", 50);
		persona.respirar();
		persona.caminar();
		System.out.println(persona.queCome("Bizcochos"));
		System.out.println(persona.equipo());
		
	}

}
