package com.alopez.gestordememoria.alopez;

public class Aplicacion {
	private String nombre;
	private int memoria;
	public Aplicacion(String nombre, int memoria) {
		this.nombre = nombre;
		this.memoria = memoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
}