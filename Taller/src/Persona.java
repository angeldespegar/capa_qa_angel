
public class Persona {

	private final int YEAR = 2018;
	private String nombre;
	private String apellido;
	private int edad;
	private String dni;
	private String sexo;
	private double peso;
	private double altura;

	public Persona(String nombre, String apellido, int edad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public Persona(String nombre, String apellido, int edad, String dni, String sexo, double peso, double altura){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		
	}

	
	public Float Imc(Float peso, Float altura){
		Float imc;
		imc = peso / (altura*altura);
		return imc;
	}
	
	public boolean isMayor(){
		 if (this.edad >= 18){
			 return true;
		 }
		 return false;
	}
	
	public int anoNacimiento(int edad){
		  
	    int ano;
		ano = YEAR - edad;
		return ano;	
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}
	
	
}