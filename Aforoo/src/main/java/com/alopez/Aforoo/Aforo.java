package com.alopez.Aforoo;

import java.util.Scanner;

public class Aforo {
	 public static void menu() {
		 Scanner teclado=new Scanner(System.in);
		 System.out.println("Introduce el aforo maximo de tu local");
		 	int AforoMax=teclado.nextInt();
	       	String[] Sala = new String [AforoMax];
	       	
	        boolean salir=false;
	        int opcion;
	        while(!salir) {
				System.out.println("1. Meter a una persona");
				System.out.println("2. Sacar a una persona");
				System.out.println("3. Aforo actual");
				System.out.println("4. Configurar aforo maximo");
				System.out.println("5. Salir");
				opcion = teclado.nextInt();
				switch (opcion) {
				case 1:
					System.out.println("Ha entrado al local " +entrar(Sala));
					break;
				case 2:
					System.out.println();
					break;
				case 3:
					System.out.println("El aforo es de " );
					break;
				case 4:
					System.out.println("El aforo maximo ahora es de");
					break;
				case 5:
					System.out.println("");
					salir=true;
					break;
				default:
					System.out.println("Has introducido un numero incorrecto");
				}
			}
	    }
	 public static int entrar(String[]Sala) {
		 Scanner teclado=new Scanner(System.in);
		 int numero=0;
		 String persona;
		 System.out.println("Bienvenido. ¿Cual es su nombre?");
		persona=teclado.nextLine();
		Sala[Sala.length]=persona;
		numero= Sala.length;
		return numero;
		
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

}
