package com.alopez.gestordememoria.alopez;

public class GestorDeMemoria {
	private int memoriaMax;
	private String[] memoria;

	public GestorDeMemoria(int memoriaMax) {
		this.memoriaMax = 0;
		this.memoria = new String[memoriaMax];
		crearArray();
	}

	public int getMemoriaMax() {
		return memoriaMax;
	}

	public void setMemoriaMax(int memoriaMax) {
		this.memoriaMax = memoriaMax;
	}

	public String[] getApp() {
		return memoria;
	}

	public void setApp(String[] memoria) {
		this.memoria = memoria;
	}

	private int buscar(String nombre) {
		int pos = -1;
		for (int i = 0; i < memoria.length; i++) {
			if (memoria[i] == nombre) {
				pos = i;
			}
		}
		return pos;
	}

	private int posicionVacia(Aplicacion ap1) {
		int espacio = ap1.getMemoria();
		boolean vacio = true;
		int posicion = -1;
		
		for(int i = 0; i < memoria.length; i++) {
			if(memoria[i].equals("-")) {
				int indice=i+espacio;
				for(int j=i;j<indice && indice<memoria.length;j++) {
					if(!memoria[j].equals("-")) {
						vacio = false;
					}
				}
				if(vacio) {
					posicion = i;
					break;
				}else {
					vacio=true;
				}
			}
		}
		return posicion;
	}

	public int cargarApp(Aplicacion ap1) {
		int error = buscar(ap1.getNombre());
		int posicion = posicionVacia(ap1);

		if (error == -1 && ap1.getMemoria() < memoria.length && posicion != -1) {
			int aux = posicion + ap1.getMemoria();
			for (int i = posicion; i < aux; i++) {
				if(memoria[i].equals("-")) {
					memoria[posicion++]=ap1.getNombre();
				}
			}
		}
		return error;
	}

	public int quitarApp(Aplicacion ap1) {

		int error = buscar(ap1.getNombre());
		if (error != -1) {
			for (int i = 0; i < memoria.length; i++) {
				if (memoria[i] == ap1.getNombre()) {
					memoria[i] = null;
				}
			}

		}
		return error;
	}

	private void crearArray() {
		for (int i = 0; i < memoria.length; i++) {
			if (memoria[i] == null) {
				memoria[i] = "-";
			}
		}
	}
	public void mostrar() {
		crearArray();
		for (int i = 0; i < memoria.length; i++) {
			System.out.print(" "+memoria[i]);
		}
	}
}