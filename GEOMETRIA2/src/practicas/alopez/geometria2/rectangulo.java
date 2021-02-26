package practicas.alopez.geometria2;


public class rectangulo {
	private double base;
	private double altura;
	
	public rectangulo(double rbase, double raltura) {
		if(base<=0 || altura<=0 ) {
			System.out.println("La base o la altura del rectangulo es incorrecta");
			return;
		}
		base=rbase;
		altura=raltura;
	}
	
	public double perimetro() {
		
		return 2*(base+altura);
		
	}
	
	public double area() {
		
		return base*altura;
	}
	public boolean isRegular() {
		if(base==altura) {
			return true;
		}
		else {
			return false;
		}
	}
}
