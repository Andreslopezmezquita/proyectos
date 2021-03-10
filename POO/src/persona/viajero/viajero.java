package persona.viajero;

public class viajero {
	private static int total;
	private String DNI;
	private String Nombre;
	private String Apellidos;
	private String Nacionalidad;
	private String Direccion;
	
	//Constructores
	
	public viajero(String DNI, String Nombre, String Apellidos, String Nacionalidad, String Direccion) {
		this.DNI = DNI;
		this.Nombre = Nombre;
		this.Apellidos = Apellidos;
		this.Nacionalidad = Nacionalidad;
		this.Direccion = Direccion;
		this.total ++;
	}
	
	public viajero () {
		this.DNI="";
		this.Nombre="";
		this.Apellidos="";
		this.Nacionalidad="";
		this.Direccion="";
		this.total ++;
	}
	
	//metodos de lectura y escritura
	
	public String getDNI() {
		return this.DNI;
	}
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	public String getNombre() {
		return this.Nombre;
	}
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	public String getApellidos() {
		return this.Apellidos;
	}
	public void setApellidos(String Apellidos) {
		this.Apellidos = Apellidos;
	}
	public String getNacionalidad() {
		return this.Nacionalidad;
	}
	public void setNacionalidad(String Nacionalidad) {
		this.Nacionalidad = Nacionalidad;
	}
	public String getDireccion() {
		return this.Direccion;
	}
	public void setDireccion(String Direccion) {
		this. Direccion =  Direccion;
	}
	public void getInfo() {
		System.out.println(getDNI());
		System.out.println(getNombre());
		System.out.println(getApellidos());
		System.out.println(getNacionalidad());
		System.out.println(getDireccion());
		System.out.println(this.total);
	}
	
}
