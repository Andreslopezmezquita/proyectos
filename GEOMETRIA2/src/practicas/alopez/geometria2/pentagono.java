package practicas.alopez.geometria2;

public class pentagono {
	private double lado1;
	
	public pentagono(double l1) {
		if(l1<=0) {
		System.out.println("Alguno de los valores de los lados del pentagono es incorrecto");
		return;
	}
	lado1=l1;
	}
	

	public double perimetro() {
		
		return lado1*5;
	}
	
	public double area() {
		return (lado1*5) * apotema( lado1 );
	}
	
	private double apotema( double lado) {
		return lado / ( 2*Math.tan(Math.PI/5) );
	}
	
	public boolean isRegular() {
		return true;
	}	
}


