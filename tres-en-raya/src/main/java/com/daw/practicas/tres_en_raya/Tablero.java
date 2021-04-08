package com.daw.practicas.tres_en_raya;

public class Tablero {
	private Tablero Tablero[][];

	private void Tablero() {
		 
	    for (int i = 0; i < Tablero.length; i++) {
	        for (int j = 0; j < Tablero.length; j++) {
	            Tablero[i][j] = null;
	        }
	    }	 
	        for (int i = 0; i < this.Tablero.length; i++) {
	            for (int j = 0; j < this.Tablero[0].length; j++) {
	                System.out.print(this.Tablero[i][j] + " ");
	            }
	            System.out.println("");
	        }
	     
	    }
}
