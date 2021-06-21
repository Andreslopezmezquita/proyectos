package com.alopez.gestordememoria.alopez;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	

      GestorDeMemoria M1 = new GestorDeMemoria(10);    	
    	
    	Aplicacion ap1 = new Aplicacion("Whatssap",2);
    	Aplicacion ap2 = new Aplicacion("Instagram",3);
    	Aplicacion ap3 = new Aplicacion("Tik-tok",3);
    	Aplicacion ap4 = new Aplicacion("Marca",1);
    	Aplicacion ap5 = new Aplicacion("Facebook",1);
    	Aplicacion ap6 = new Aplicacion("Ap1",1);
    	Aplicacion ap7 = new Aplicacion("Ap7",1);
    	Aplicacion ap8 = new Aplicacion("Ap8",2);
    	
    
    	 M1.cargarApp(ap1);
    	 M1.cargarApp(ap2);
    	 M1.cargarApp(ap3);
    	 M1.cargarApp(ap4);
    	 M1.cargarApp(ap5);
    	 M1.cargarApp(ap6);
    	 
    	 
    	 M1.mostrar();
    	 System.out.println(" ");
    	 M1.quitarApp(ap1);
    	 M1.quitarApp(ap3);
    	 M1.quitarApp(ap5);
    	 M1.mostrar();
    	 
    	 System.out.println(" ");
    	 
    	 M1.cargarApp(ap7);
    	 M1.cargarApp(ap8);
    	 M1.mostrar();
    	 //M1.crearArray();
    	 //M1.mostrar();
    	
    }
}
