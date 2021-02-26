package practicas.alopez.geometria2;

public class test {

	public static void main(String[] args) {
	
		triangulo t=new triangulo(10,10,10);
	System.out.println("El perimetro del Triangulo es: " + t.perimetro());
	System.out.println("El area del Triangulo es: " + t.area());
	System.out.println("El Triangulo es " + t.isRegular());
	
		rectangulo r=new rectangulo(10,10);
	System.out.println("El perimetro del Rectangulo es: " + r.perimetro());
	System.out.println("El area del Rectangulo es: " + r.area());
	System.out.println("El Rectangulo es " + r.isRegular());
	
	
		pentagono p=new pentagono(10);
	System.out.println("El perimetro del Pentagono es: " + p.perimetro());
	System.out.println("El area del Pentagono es: " + p.area());
	System.out.println("El Pentagono es " + p.isRegular());
	
	
		hexagono h=new hexagono(10);
	System.out.println("El perimetro del Hexagono es: " + h.perimetro());
	System.out.println("El area del Hexagono es: " + h.area());
	System.out.println("El Hexagono es " + h.isRegular());
	
		circulo c=new circulo(10);
	System.out.println("El perimetro del Circulo es: " + c.perimetro());
	System.out.println("El area del Circulo es: " + c.area());
	System.out.println("El Circulo es " + c.isRegular());
	}

}


