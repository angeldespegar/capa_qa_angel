package herencia;

public class Principal {

	
	public static void main(String[] args) {
		
		Empleado empleado = new Empleado("Jose", "Sabia", 34, "234234243", "M", 76.0, 2.0, "234", "2001", 23450, "agua", "lavalleja");
		System.out.println("El nombre del empleado es: " + empleado.getNombre() + " " + empleado.getApellido() );
		System.out.println("La antiguedad del empleado es: " + empleado.antiguedad());
		System.out.println("El salario actual del empleado es: " + empleado.aumento());
	}

}
