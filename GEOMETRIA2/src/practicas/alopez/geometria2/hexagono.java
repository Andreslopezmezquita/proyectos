package practicas.alopez.geometria2;

public class hexagono {
	private double lado1;
	
	public hexagono(double l1 ) {
	if(l1<=0) {
		System.out.println("Alguno de los valores de los lados del hexagono es incorrecto");
		return;
	}
	lado1=l1;
	}

		public double perimetro() {
			
		return lado1*6;
		}
			
		public double area() {
			return (lado1*6) * apotema( lado1 );
		}
		
		private double apotema( double lado) {
			return lado / ( 2*Math.tan(Math.PI/6) );
		}
		public boolean isRegular() {
				return true;
			
		}
	}
