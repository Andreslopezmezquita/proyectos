package CalculadoraCIDR;

public class CalculadoraCIDR {
	public static boolean validadorip(String ip) {
		String ip_completa[] = ip.split("\\.");
		int byte1, byte2, byte3, byte4;
		System.out.println("Comprobando si la ip y mascara introducida es valida");

		if (ip_completa.length < 4) {
			System.out.println("La ip tiene un byte de menos");
			return false;
		} else if (ip_completa.length > 4) {
			System.out.println("La ip tiene un byte de mas");
			return false;
		}

		String ip1 = ip_completa[0];
		String ip2 = ip_completa[1];
		String ip3 = ip_completa[2];
		String ip4 = ip_completa[3];

		byte1 = Integer.parseInt(ip1);
		byte2 = Integer.parseInt(ip2);
		byte3 = Integer.parseInt(ip3);
		byte4 = Integer.parseInt(ip4);

		System.out.println("Comprobando si la ip esta dentro del rango establecido");
		if (byte1 > 255 || byte1 <= 0) {
			System.out.println("El primer bit no entra dentro del rango valido, que es de 0 a 255");
			return false;
		} else if (byte2 > 255 || byte2 < 0) {
			System.out.println("El segundo bit no entra dentro del rango valido, que es de 0 a 255");
			return false;
		} else if (byte3 > 255 || byte3 < 0) {
			System.out.println("El tercero bit no entra dentro del rango valido, que es de 0 a 255");
			return false;
		} else if (byte4 > 255 || byte4 < 0) {
			System.out.println("El cuarto bit no entra dentro del rango valido, que es de 0 a 255");
			return false;
		} else if (byte1 == 255 && byte2 == 255 && byte3 == 255 && byte4 == 255) {
			System.out.println("La ip 255.255.255.255 no es valida");
			return false;
		} else if (byte1 == 8 && byte2 == 8 && byte3 == 8 && byte4 == 8) {
			System.out.println("La ip 8.8.8.8 no es valida");
			return false;
		}
		System.out.println("La ip esta dentro del rango establecido");
		System.out.println("Calculando la clase de la ip");

		if (byte1 > 0 || byte1 < 127) {
			System.out.println("La ip es " + byte1 + "." + byte2 + "." + byte3 + "." + byte4);
			System.out.println("La ip es de clase A");
			System.out.println("El rango de ips de la clase A es desde la 0.0.0.0 a la 127.255.255.255");
			System.out.println("La cantidad de ips de que hay en la clase A es de 16.387.064");
			System.out.println("Su broadcast es " + byte1 + "." + byte2 + "." + byte3 + "." + 255);
			return false;
		}
		if (byte1 > 128 || byte1 < 191) {
			System.out.println("La ip es " + byte1 + "." + byte2 + "." + byte3 + "." + byte4);
			System.out.println("La ip es de clase B");
			System.out.println("El rango de ips de la clase B es desde la 128.0.0.0 a la 191.255.255.255");
			System.out.println("La cantidad de ips de que hay en la clase B es de 64.516");
			System.out.println("Su broadcast es " + byte1 + "." + byte2 + "." + byte3 + "." + 255);
			return false;
		}
		if (byte1 > 192 || byte1 < 223) {
			System.out.println("La ip es " + byte1 + "." + byte2 + "." + byte3 + "." + byte4);
			System.out.println("La ip es de clase C");
			System.out.println("El rango de ips de la clase C es desde la 192.0.0.0 a la 223.255.255.255");
			System.out.println("La cantidad de ips de que hay en la clase C es de 254");
			System.out.println("Su broadcast es " + byte1 + "." + byte2 + "." + byte3 + "." + 255);
			return false;
		}
		if (byte1 > 224 || byte1 < 239) {
			System.out.println("La ip es " + byte1 + "." + byte2 + "." + byte3 + "." + byte4);
			System.out.println("La ip es de clase D");
			System.out.println("El rango de ips de la clase D es desde la 224.0.0.0 a la 239.255.255.255");
			System.out.println("Su broadcast es " + byte1 + "." + byte2 + "." + byte3 + "." + 255);
			return false;
		} else {
			System.out.println("La ip es valida");
			return true;
		}
	}
	public static String subneting(int byte1,int byte2,int byte3,int byte4) {
		String binario="";
		while (byte1 > 0) {
			binario = byte1 % 2 + binario;
			byte1 /= 2;
		}
		while (byte2 > 0) {
			binario = byte2 % 2 + binario;
			byte2 /= 2;
		}
		while (byte3 > 0) {
			binario = byte3 % 2 + binario;
			byte3 /= 2;
		}
		while (byte4 > 0) {
			binario = byte4 % 2 + binario;
			byte4 /= 2;
		}
		return binario;
	}


	public static boolean validadormascara(String mascara) {
		System.out.println("Comprobando si la mascara esta dentro del rango establecido");
		int mascara1 = Integer.parseInt(mascara);
		if (mascara1 <= 0 || mascara1 > 32) {
			System.out.println("La mascara de red no es valida. Comprueba que esta entre 1 y 32");
			return false;
		} else {
			System.out.println("La mascara es valida");
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ip = args[0];
		String mascara = args[1];
		validadorip(ip);
		validadormascara(mascara);

	}

}
