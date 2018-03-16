import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class EjercicioFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		System.out.println("Ingrese numero unicamente");
		System.out.println("Para cortar ingrese cualquier otro caracter");
		
		while(leer.hasNextInt()){
			lista.add(leer.nextInt());
		
		}
		/*
		for(int i = 0; i < lista.size() ; i++){
			if (lista.get(i)<15){
			System.out.println("El numero menor a 15: " + lista.get(i));
			break;
			}
			System.out.println("El numero usando foreach es: " + lista.get(i));

		}*/
		
		for(int i = 0; i < lista.size() ; i++){
			if (lista.get(i)>15){
			System.out.println("El numero es mayor a 15");
			continue;
			}
			System.out.println("El numero usando foreach es: " + lista.get(i));

		}
		
		for(int i = 0; i < lista.size() ; i++){
			System.out.println("El numero es: " + lista.get(i));
		}
		
		Iterator iterador = lista.iterator();
		while (iterador.hasNext()){
			int numero = Integer.parseInt(iterador.next().toString());
			System.out.println("El numero usando iterator es : " + numero);
			
		}
		
		for(int numero : lista){
			System.out.println("El numero usando foreach es: " + numero);
		}
		
		
	}

}
