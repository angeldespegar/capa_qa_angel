package cuentabancaria;

public class CuentaBancaria {
	private final double COMISION = 1.2;
	private final double COMISION_SNEGATIVO = 1.2;
	private String titular;
	private String dni;
	private double saldo;
	private double monto;

	public CuentaBancaria(String titular, String dni){
			this.titular = titular;
			this.dni = dni;
			this.saldo = 0;
			this.monto = 0;
		}

	public CuentaBancaria(String titular, String dni, double saldo, double monto){
		this.titular = titular;
		this.dni = dni;
		this.saldo = saldo;
		this.monto = monto;
	}
	
	public void ingresarSaldo(double cantidad){
		
		 this.saldo += cantidad ;
	}
	
	public double calcularComisionDeRetiro(){
		int retiro = 0;
		double comision = 0;
		retiro = (int) (this.monto/1000);
		if (retiro > 0){
		comision = retiro * COMISION;
		
		}
		return comision;
	}
	
	public double saldoNegativo(){
		//boolean negativo = false;
		double saldoFinal = 0;
		double comision = 0;
		saldoFinal =  this.saldo - this.monto;
		
		if (saldoFinal < 0){
			comision = 5;
		
		}
		return comision;
	}
	
	public double saldoFinal(){
		//boolean negativo = false;
		double saldoFinal = 0;
		
		saldoFinal =  this.saldo - this.monto;
		if(saldoFinal <= 0)
		{
			saldoFinal = this.saldo - 5;
		}
		return saldoFinal;
	}
	
	
	

	public String getTitular() {
		return titular;
	}

	public String getDni() {
		return dni;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getMonto() {
		return monto;
	}
	
	
	
	
	
}

