package herencia;

public class Empleado extends Persona {

	private final int YEAR = 2018;
	private String numeroEmpleado;
	private String fechaIgreso;
	private double salarioIngreso;
	private String puestoActual;
	private String departamento;
	
	

	
	public Empleado(String nombre, String apellido, int edad, String dni, String sexo, double peso, double altura,
			String numeroEmpleado, String fechaIgreso, double salarioIngreso, String puestoActual,
			String departamento) {
		super(nombre, apellido, edad, dni, sexo, peso, altura);
		this.numeroEmpleado = numeroEmpleado;
		this.fechaIgreso = fechaIgreso;
		this.salarioIngreso = salarioIngreso;
		this.puestoActual = puestoActual;
		this.departamento = departamento;
	}

	@Override
	public String queHace(String respuesta) {
		
		return "Lo que hace es: " + puestoActual;
	}

	public int antiguedad(){
		return YEAR - Integer.parseInt(fechaIgreso);
	}

	public double aumento(){
		
		if(antiguedad()>2){
			return (antiguedad()*1.05) * salarioIngreso;
		}
		else{
			return(antiguedad()*1.02) * salarioIngreso;
		}
		
		
	}
	
	
	
	
	/*--------------------------------------------*/
	public String getNumeroEmpleado() {
		return numeroEmpleado;
	}
	public void setNumeroEmpleado(String numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	public String getFechaIgreso() {
		return fechaIgreso;
	}
	public void setFechaIgreso(String fechaIgreso) {
		this.fechaIgreso = fechaIgreso;
	}
	public double getSalarioIngreso() {
		return salarioIngreso;
	}
	public void setSalarioIngreso(double salarioIngreso) {
		this.salarioIngreso = salarioIngreso;
	}
	public String getPuestoActual() {
		return puestoActual;
	}
    public void setPuestoActual(String puestoActual) {
		this.puestoActual = puestoActual;
	}
    public String getDepartamento() {
		return departamento;
	}
    public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
    /*--------------------------------------------*/

}
