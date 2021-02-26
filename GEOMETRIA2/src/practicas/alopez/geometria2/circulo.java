package practicas.alopez.geometria2;

public class circulo {
	private double radio;
	
	public circulo(double cradio) {
	if(cradio<=0) {
		System.out.println("El radio del circulo es es incorrecto");
	return;
	}
		radio=cradio;
	}
	public double perimetro() {
		
		return Math.PI*2*radio;
		
	}
	public double area() {
		
		return Math.PI*(radio*radio);
		
	}
	public boolean isRegular() {
			return true;

	}
}
