package ejercicioTelefono;

import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		TelefonoCelular tel = new TelefonoCelular(0, 0, null, null, null);
		
		while(leer.hasNextInt()){
			tel.agenda(leer.nextLine());
		
		}
		 tel.mostrarAgenda();
		
		
		
	}

}
