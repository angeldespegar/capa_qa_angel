import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String opcion;
		int numero1;
		int numero2;
		int resultado;

		System.out.println("Elije la operacion que desea realizar:");
		System.out.println("+" + " " + "-" + " " + "*" + " " + "/");

		opcion = leer.next();
		System.out.println("Escribe el primer numero");
		numero1 = leer.nextInt();

		System.out.println("Escribe el segundo numero");
		numero2 = leer.nextInt();

		// opcion = "0";
		if (opcion.equals("+")) {
			resultado = (numero1 + numero2);
			System.out.println("La opeacion a realizar es: " + numero1 + opcion + numero2);
			System.out.println("Resultado de la suma: " + (resultado));
			resultado = leer.nextInt();
		} 
		  else if (opcion.equals("*")) {
			resultado = (numero1 * numero2);
			System.out.println("La opeacion a realizar es: " + numero1 + opcion + numero2);
			System.out.println("Resultado de la multiplicacion: " + (resultado));
			resultado = leer.nextInt();
		}
		  else if (opcion.equals("/")) {
			if (numero2 == 0) {
				System.out.println("La opeacion no es valida Numero 2 no puede ser 0 en una division");
			} else {
				resultado = (numero1 / numero2);
				System.out.println("La opeacion a realizar es: " + numero1 + opcion + numero2);
				System.out.println("Resultado de la division: " + (resultado));
				resultado = leer.nextInt();
			}

		}
		  else if (opcion.equals("-")) {
				resultado = (numero1 * numero2);
				System.out.println("La opeacion a realizar es: " + numero1 + opcion + numero2);
				System.out.println("Resultado de la resta: " + (resultado));
				resultado = leer.nextInt();
			}
		
		// System.out.println("Resultado de suma: " + (numero1 + numero2));
		// System.out.println("Resultado de resta: " + (numero1 - numero2));
		// System.out.println("Resultado de multiplicacion: " + (numero1 *
		// numero2));
		// System.out.println("Resultado de division: " + (numero1 / numero2));

	}

}
