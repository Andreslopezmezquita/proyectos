package com.daw.practicas.tres_en_raya;

import java.util.Scanner;

public class Tablero {
	private String tablero[][];
	private int Fila1 = 0;
	private int Columna1 = 0;
	private int Fila2 = 0;
	private int Columna2 = 0;

	public Tablero() {
		this.tablero = new String[3][3];
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = "[]";
			}
		}

	}

	public void mostrartablero() {
		for (int i = 0; i < this.tablero.length; i++) {
			for (int j = 0; j < this.tablero[0].length; j++) {
				System.out.print(this.tablero[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public void jugar1vs1() {
		Scanner teclado = new Scanner(System.in);
		boolean salir = false;
		for (int i = 0; i < 4; i++) {
			while (!salir) {
				System.out.println("Introduce la fila");
				this.Fila1 = teclado.nextInt();
				System.out.println("Introduce la columna");
				this.Columna1 = teclado.nextInt();
				this.tablero[Fila1 - 1][Columna1 - 1] = "O";
				if (this.Fila1 > 3 || this.Columna1 > 3 || this.Fila1 <= 0 || this.Columna1 <= 0) {
					System.out.println("Has colocado la ficha fuera del tablero");
				}
				if (this.tablero[this.Fila1 - 1][this.Columna1 - 1] != "[]") {
					System.out.println("Has colocado la ficha encima de otra y eso no se puede");
				}

				mostrartablero();
				ComprobarGanador();
				salir = true;
			}
			while (salir) {
				System.out.println("Introduce la fila");
				this.Fila2 = teclado.nextInt();
				System.out.println("Introduce la columna");
				this.Columna2 = teclado.nextInt();
				this.tablero[Fila2 - 1][Columna2 - 1] = "X";
				if (this.Fila2 > 3 || this.Columna2 > 3 || this.Fila2 <= 0 || this.Columna2 <= 0) {
					System.out.println("Has colocado la ficha fuera del tablero");
				}
				if (this.tablero[this.Fila2 - 1][this.Columna2 - 1] != "[]") {
					System.out.println("Has colocado la ficha encima de otra y eso no se puede");
				}

				mostrartablero();
				ComprobarGanador();
				salir = false;
			}
		}
		ComprobarGanador();
	}

	private void ComprobarGanador() {
		
		if ((this.tablero[0][0] == "X" && this.tablero[0][1] == "X" && this.tablero[0][2] == "X") 
				|| (this.tablero[0][0] == "O" && this.tablero[0][1] == "O" && this.tablero[0][2] == "0")) {
			System.out.println("ENHORABUENA, HAS GANADO");
		}
		if ((this.tablero[1][0] == "X" && this.tablero[1][1] == "X" && this.tablero[1][2] == "X")
				|| (this.tablero[1][0] == "O" && this.tablero[1][1] == "O" && this.tablero[1][2] == "O")) {
			System.out.println("ENHORABUENA, HAS GANADO");
		}

		if ((this.tablero[2][0] == "X" && this.tablero[2][1] == "X" && this.tablero[2][2] == "X")
				|| (this.tablero[2][0] == "O" && this.tablero[2][1] == "O" && this.tablero[2][2] == "O")) {
			System.out.println("ENHORABUENA, HAS GANADO");
		}
		if ((this.tablero[0][0] == "X" && this.tablero[1][0] == "X" && this.tablero[2][0] == "X")
				|| (this.tablero[0][0] == "O" && this.tablero[1][0] == "O " && this.tablero[2][0] == "O")) {
			System.out.println("ENHORABUENA, HAS GANADO");
		}
		if ((this.tablero[0][1] == "X" && this.tablero[1][1] == "X" && this.tablero[2][1] == "X")
				|| (this.tablero[0][1] == "O" && this.tablero[1][1] == "O" && this.tablero[2][1] == "O")) {
			System.out.println("ENHORABUENA, HAS GANADO");
		}
		if ((this.tablero[2][0] == "X" && this.tablero[2][1] == "X" && this.tablero[2][2] == "X")
				|| (this.tablero[2][0] == "O" && this.tablero[2][1] == "O" && this.tablero[2][2] == "O")) {
			System.out.println("ENHORABUENA, HAS GANADO");
		}
		if ((this.tablero[0][0] == "X" && this.tablero[1][1] == "X" && this.tablero[2][2] == "X")
				|| (this.tablero[0][0] == "2" && this.tablero[1][1] == "O" && this.tablero[2][2] == "O")) {
			System.out.println("ENHORABUENA, HAS GANADO");
		}
		if ((this.tablero[0][2] == "X" && this.tablero[1][1] == "X" && this.tablero[2][0] == "X")
				|| (this.tablero[0][2] == "O" && this.tablero[1][1] == "O" && this.tablero[2][0] == "O")) {
			System.out.println("ENHORABUENA, HAS GANADO");
		}
		else {
			System.out.println("Habeis empatado");
		}
	}

}