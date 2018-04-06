
public class Principal {

	public static void main(String[] args) {
		
	Persona p1 = new Persona();
	Persona p2 = new Persona("Juan","Martinez", 25, "234567", "Masculino", 68, 1.87);
	
	p1.setNombre("Pedro");
	p1.setApellido("Sanchez");
	p1.setEdad(34);
	p1.setSexo("Masculino");
	p1.setPeso(68.0);
	p1.setAltura(1.75);
	System.out.println("El peso de " + p1.getNombre() + " es " + p1.getPeso());
	System.out.println("El peso de " + p2.getNombre() + " es " + p2.getPeso());

	}
}








/*Persona pers = new Persona("Angel", "Fernandez", 34, "3.343.432-4", "M", 76, 1.67);

System.out.println(pers.getNombre() + " " + pers.getApellido());
System.out.println("Es mayor de edad:" + pers.isMayor());
*/