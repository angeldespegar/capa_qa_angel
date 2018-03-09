import java.util.Scanner;

public class Calculadora {

public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);
	String opcion;
	int numero1;
	int numero2;
	
	System.out.println("Elije la operacion que desea realizar");
	System.out.println("+");
	System.out.println("-");
	System.out.println("*");
	System.out.println("/");
	
	opcion = leer.next();
	System.out.println("Escribe el primer numero");
	numero1 = leer.nextInt();
	
	System.out.println("Escribe el segundo numero");
	numero2 = leer.nextInt();
	
	System.out.println("La opeacion a realizar es: " + numero1 + opcion + numero2);
	System.out.println("Resultado de suma: " + (numero1 + numero2));
	System.out.println("Resultado de resta: " + (numero1 - numero2));
	System.out.println("Resultado de multiplicacion: " + (numero1 * numero2));
	System.out.println("Resultado de division: " + (numero1 / numero2));
	
	
	
	
	
	
	
}

}
