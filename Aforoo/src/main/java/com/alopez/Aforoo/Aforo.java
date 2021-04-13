package com.alopez.Aforoo;

import java.util.Scanner;

public class Aforo {
	public static boolean Entrar(int aforomax, int aforo, int entradas) {
		aforo += entradas;
		if (entradas <= 0) {
			System.out.println("No pueden entrar personas negativas");
			return false;
		} else if (aforo > aforomax) {
			System.out.println("Lo siento estamos completos");
			return false;
		} else if (aforo <= aforomax && aforo > 0) {
			System.out.println("Bienvenido. Puedes pasar");
			return true;
		}
		return true;
	}

	public static boolean Salir(int aforomax, int aforo, int salidas) {
		aforo -= salidas;
		if (salidas <= 0) {
			System.out.println("Pon numeros positivos aunque sean salidas");
			return false;
		} else if (aforomax < aforo || aforo < 0) {
			System.out.println("Es imposible que salgan mas personas de las que habia dentro");
			return false;
		} else if (aforo >= 0) {
			System.out.println("Adios, hasta pronto");
			return true;
		}
		return true;
	}

	public static int Mostraraforo(int aforo) {
		return aforo;
	}

	public static int MostrarAforoMax(int aforomax) {

		return aforomax;
	}

	public static void menu() {
		Scanner teclado = new Scanner(System.in);
		boolean salir = false;
		int aforo = 0;
		int aforomax = 0;
		int opcion;
		while (!salir) {
			System.out.println("1. Meter a una persona");
			System.out.println("2. Sacar a una persona");
			System.out.println("3. Aforo actual");
			System.out.println("4. Configurar aforo maximo");
			System.out.println("5. Salir");
			opcion = teclado.nextInt();
			if (opcion < 4 && aforomax <= 0) {
				System.out.println("Seleciona primero la opcion 4 para configurar el aforo de tu local");
			} else {
				switch (opcion) {
				case 1:
					System.out.println("Introduce las personas que van a entrar");
					int entradas = teclado.nextInt();
					if (Entrar(aforomax, aforo, entradas) == false) {

					} else {
						aforo += entradas;
					}
					break;
				case 2:
					System.out.println("Introduce las personas que van a salir");
					int salidas = teclado.nextInt();
					if (Salir(aforomax, aforo, salidas) == false) {

					}

					else {
						aforo -= salidas;
					}
					break;
				case 3:
					System.out.println("El aforo es de " + Mostraraforo(aforo) + " y el aforo maximo es de "
							+ MostrarAforoMax(aforomax));
					break;
				case 4:
					System.out.println("Dime el aforo maximo que hay en tu local");
					aforomax = teclado.nextInt();
					if (aforomax < 0) {
						System.out.println("El aforo no puede ser negativo");
					} else {
						System.out.println("El aforo maximo ahora es de " + MostrarAforoMax(aforomax));
					}
					break;
				case 5:
					System.out.println("Ya son las 23:00 hay que cerrar. Hasta mañana");

					salir = true;
					break;
				default:
					if (opcion < 0 || opcion > 5) {
						System.out.println("Has introducido un numero incorrecto");
					}
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

}
