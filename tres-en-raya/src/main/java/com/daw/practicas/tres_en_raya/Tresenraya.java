package com.daw.practicas.tres_en_raya;

public class Tresenraya {
	private char Jugador1 = 'O';
	private char Jugador2 = 'X';
	 private Tablero Tablero[][];

public Tresenraya(char Jugador1, char Jugador2, String Tablero[][]) {
        this.Jugador1 =  Jugador1;
        this.Jugador2 = Jugador2;
        this.Tablero = new Tablero [3][3];
       
    }
	public char getJugador1() {
    	return  Jugador1;
	}

	public void setJugador1(char Jugador1) {
		this.Jugador1 =  Jugador1;
	}
	public char getJugador2() {
    	return  Jugador2;
	}

	public void setJugador2(char Jugador2) {
		this.Jugador2 =  Jugador2;
	}
	public Tablero[][] getTablero() {
    	return  Tablero;
	}

	public void setTablero(Tablero[][] Tablero) {
		this.Tablero =  Tablero;
	}
}
