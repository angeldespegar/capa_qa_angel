package cuentabancaria;

import java.util.Scanner;

public class Cuenta {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		String opcion;
		
		String nombre = null;
		String dni = null;
		Double monto = 0.0;
		Double saldo = 0.0;
		
		System.out.println("Ingrese su nombre:");
		nombre = leer.next();

		
		System.out.println("Ingrese su DNI");
		dni = leer.next();
		
		System.out.println("Ingrese su saldo");
		saldo = leer.nextDouble();
		
		System.out.println("Ingrese su el monto a retirar");
		monto = leer.nextDouble();
		
		CuentaBancaria c1 = new CuentaBancaria(nombre, dni, saldo, monto);
		
		System.out.println("La comision es " + c1.calcularComisionDeRetiro());
		System.out.println("La comision extra por saldo negativo " + c1.saldoNegativo());
		System.out.println("Su saldo es: " + c1.saldoFinal());
		
		
		
	}

}
