
public class Principal {

	public static void main(String[] args) {
		Persona pers = new Persona("Angel", "Fernandez", 34, "3.343.432-4", "M", 76, 1.67);
		
		System.out.println(pers.getNombre() + " " + pers.getApellido());
		System.out.println("Es mayor de edad:" + pers.isMayor());
	}
}