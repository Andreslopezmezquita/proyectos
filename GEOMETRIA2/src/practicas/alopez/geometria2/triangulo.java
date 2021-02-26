package practicas.alopez.geometria2;

public class triangulo {
	private double lado1;
	private double lado2;
	private double lado3;
	
	public triangulo(double l1, double l2, double l3) {
	if(l1<=0 || l2<=0 || l3<=0 ) {
			System.out.println("Alguno de los valores del triangulo es incorrecto");
			return;
		}
		lado1=l1;
		lado2=l2;
		lado3=l3;
	}
	
	public double perimetro() {
		return lado1+lado2+lado3;
	}
	
	public double area() {
		return (lado1*lado2*lado3);
	}
		
	public boolean isRegular() {
		if (lado1==lado2 || lado2==lado3) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
