package com.daw.practicas.tres_en_raya;

import java.util.Scanner;

public class Tablero {
	Scanner teclado = new Scanner(System.in);
	private String tablero[][];
	private int Fila1 = 0;
	private int Columna1 = 0;
	private int Fila2 = 0;
	private int Columna2 = 0;

	public Tablero() {
		this.tablero = new String[3][3];
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				this.tablero[i][j] = "[]";
			}
		}

	}


	private void mostrartablero() {
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < this.tablero[0].length; j++) {
				System.out.print(this.tablero[i][j] + " ");
			}
			System.out.println("");
		}
	}
	 public void limpiar(){
	        for (int f = 0; f < tablero.length; f++) {
	            for (int c = 0; c < tablero[0].length; c++) {
	                tablero[f][c] = "[]";
	            }
	        }
	 }
	    

	public void menu(String []jugada) {
		boolean salir = false;
		int opcion;
		while (!salir) {
			System.out.println("¿Que modo de juego quieres elegir?");
			System.out.println("1. Jugar 1 contra 1");
			System.out.println("2. Jugar contra el ordenador");
			System.out.println("3. ");
			System.out.println("4. Salir");
			opcion = teclado.nextInt();
				switch (opcion) {
				case 1:
					jugar1vs1();
					break;
				case 2:
					jugar1vsPc();
					break;
				case 3:
					jugarComandos(jugada);
					break;
		
				case 4:
					System.out.println("Adios");
					salir = true;
					break;
				default:

				}
			}
	}
	private void jugar1vs1() {
		boolean aux = true;
		for (int i = 0; i < 4; i++) {
			while (aux) {
				jugador1();
				if (this.Fila1 > 3 || this.Columna1 > 3 || this.Fila1 <= 0 || this.Columna1 <= 0) {
					System.out.println("Has colocado la ficha fuera del tablero");
					aux = true;
					continue;
				}
				if (this.tablero[this.Fila1 - 1][this.Columna1 - 1] != "[]") {
					System.out.println("Has colocado la ficha encima de otra");
					aux = true;
					continue;
				}
				this.tablero[Fila1 - 1][Columna1 - 1] = "X";
				mostrartablero();
				if (comprobarGanador()) {
					System.out.println("ENHORABUENA, EL JUGADOR 1 HA GANADO");
					limpiar();
					return;
				}
				aux= false;
			}
			while (!aux) {
				jugador2();
				if (this.Fila2 > 3 || this.Columna2 > 3 || this.Fila2 <= 0 || this.Columna2 <= 0) {
					System.out.println("Has colocado la ficha fuera del tablero");
					aux = false;
					continue;
				}
				if (this.tablero[this.Fila2 - 1][this.Columna2 - 1] != "[]") {
					System.out.println("Has colocado la ficha encima de otra");
					aux = false;
					continue;
				}
				this.tablero[Fila2 - 1][Columna2 - 1] = "O";
				mostrartablero();
				if (comprobarGanador()) {
					System.out.println("ENHORABUENA, EL JUGADOR 2 HA GANADO");
					limpiar();
					return;
					
				}
				aux = true;
			}
		}
		System.out.println("Habeis empatado probar otra vez");
	}

	private void jugador1() {
			
		System.out.println("Le toca al jugador 1 (X),introduce la fila");
			this.Fila1 = teclado.nextInt();
			System.out.println("Le toca al jugador 1 (X),introduce la columna");
			this.Columna1 = teclado.nextInt();		
}

	private void jugador2() {
		System.out.println("Le toca al jugador 2 (O),introduce la fila");
		this.Fila2 = teclado.nextInt();
		System.out.println("Le toca al jugador 2 (O),introduce la columna");
		this.Columna2 = teclado.nextInt();
}
	
	private void jugar1vsPc() {
		boolean aux = true;
		for (int i = 0; i < 4; i++) {
			while (aux) {
				jugador1();
				if (this.Fila1 > 3 || this.Columna1 > 3 || this.Fila1 <= 0 || this.Columna1 <= 0) {
					System.out.println("Has colocado la ficha fuera del tablero");
					aux = true;
					continue;
				}
				if (this.tablero[this.Fila1 - 1][this.Columna1 - 1] != "[]") {
					System.out.println("Has colocado la ficha encima de otra");
					aux = true;
					continue;
				}
				
				this.tablero[Fila1 - 1][Columna1 - 1] = "O";
				mostrartablero();
				if (comprobarGanador()) {
					System.out.println("ENHORABUENA, EL JUGADOR 1 HA GANADO");
					limpiar();
					return;
				}
				aux= false;
			}
			while (!aux) {
				System.out.println("Le toca al ordenador");
				this.Fila2 = (int) (Math.random()*3+1);
				this.Columna2 = (int) (Math.random()*3+1);
				if(this.tablero[this.Fila2 - 1][this.Columna2 - 1] != "[]") {
					continue;
				}
				this.tablero[Fila2 - 1][Columna2 - 1] = "X";
				mostrartablero();
				if (comprobarGanador()) {
					System.out.println("ENHORABUENA, EL JUGADOR 2 HA GANADO");
					limpiar();
					return;
				}
				aux = true;
			}
		}
		limpiar();
		System.out.println("Habeis empatado");
	}
	private void jugarComandos(String []jugadaCompleta) {
		
		String jugada[] = jugadaCompleta.split(";");
		
		String Jugada1 = Jugada[0];
		String Jugada2 = Jugada[1];
		String Jugada3 = Jugada[2];
		String Jugada4 = Jugada[3];
		String Jugada5 = Jugada[4];
		String Jugada6 = Jugada[5];
		String Jugada7 = Jugada[6];
		String Jugada8 = Jugada[7];
		String Jugada9 = Jugada[8];
		
	}

	private boolean comprobarGanador() {
		boolean ganador = true;
		if (this.tablero[0][0] == "X" && this.tablero[0][1] == "X" && this.tablero[0][2] == "X") {
			return ganador;
		}
		if (this.tablero[0][0] == "O" && this.tablero[0][1] == "O" && this.tablero[0][2] == "O") {
			return ganador;
		}
		if (this.tablero[1][0] == "X" && this.tablero[1][1] == "X" && this.tablero[1][2] == "X") {
			return ganador;
		}
		if (this.tablero[1][0] == "O" && this.tablero[1][1] == "O" && this.tablero[1][2] == "O") {
			return ganador;
		}

		if (this.tablero[2][0] == "X" && this.tablero[2][1] == "X" && this.tablero[2][2] == "X") {
			return ganador;
		}
		if (this.tablero[2][0] == "O" && this.tablero[2][1] == "O" && this.tablero[2][2] == "O") {
			return ganador;
		}
		if (this.tablero[0][0] == "X" && this.tablero[1][0] == "X" && this.tablero[2][0] == "X") {
			return ganador;
		}
		if (this.tablero[0][0] == "O" && this.tablero[1][0] == "O " && this.tablero[2][0] == "O") {
			return ganador;
		}
		if (this.tablero[0][1] == "X" && this.tablero[1][1] == "X" && this.tablero[2][1] == "X") {
			return ganador;
		}
		if (this.tablero[0][1] == "O" && this.tablero[1][1] == "O" && this.tablero[2][1] == "O") {
			return ganador;
		}
		if (this.tablero[2][0] == "X" && this.tablero[2][1] == "X" && this.tablero[2][2] == "X") {
			return ganador;
		}
		if (this.tablero[2][0] == "O" && this.tablero[2][1] == "O" && this.tablero[2][2] == "O") {
			return ganador;
		}
		if (this.tablero[0][0] == "X" && this.tablero[1][1] == "X" && this.tablero[2][2] == "X") {
			return ganador;
		}
		if (this.tablero[0][0] == "2" && this.tablero[1][1] == "O" && this.tablero[2][2] == "O") {
			return ganador;
		}
		if (this.tablero[0][2] == "X" && this.tablero[1][1] == "X" && this.tablero[2][0] == "X") {
			return ganador;
		}
		if (this.tablero[0][2] == "O" && this.tablero[1][1] == "O" && this.tablero[2][0] == "O") {
			return ganador;
		}
		return false;

	}
}