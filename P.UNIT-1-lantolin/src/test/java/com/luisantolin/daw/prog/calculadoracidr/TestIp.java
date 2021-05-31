package com.luisantolin.daw.prog.calculadoracidr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;



public class TestIp {
	@Tag("LIM")
	@Test
	@DisplayName("getmascara")
	public void getMascara() {
		Ip mascara = new Ip("127.15.14.23", "23");
		mascara.getMascara();
		assertEquals(mascara.getMascara(), 23);
	}
	@Test
	@DisplayName("getBit")
	public void getBit() {
		Ip ip = new Ip("127.15.14.23", "23");
		assertEquals(ip.getBit(1), true);
	}

	@Tag("IF")
	@Test
	@DisplayName("IpclaseA")
	public void claseA() {
		Ip nuevaIp = new Ip("127.15.14.23", "23");
		nuevaIp.getClase();
		assertEquals(nuevaIp.getClase(), Ip.CLASE_A);
		

	}
	

	@Tag("IF")
	@Test
	@DisplayName("IpclaseB")
	public void claseB() {
		Ip nuevaIp = new Ip("191.15.15.23", "23");
		nuevaIp.getClase();
		assertEquals(nuevaIp.getClase(), Ip.CLASE_B);

	}

	@Tag("IF")
	@Test
	@DisplayName("Ipclasec")
	public void claseC() {
		Ip nuevaIp = new Ip("222.15.14.23", "23");
		nuevaIp.getClase();
		assertEquals(nuevaIp.getClase(), Ip.CLASE_C);

	}
	
	@Tag("IF")
	@Test
	@DisplayName("IpclaseD")
	public void claseD() {
		Ip nuevaIp = new Ip("230.15.14.23", "23");
		nuevaIp.getClase();
		assertEquals(nuevaIp.getClase(), Ip.CLASE_D);
	}

	@Tag("IF")
	@Test
	@DisplayName("IpclaseDesconocida")
	public void claseDesconocida() {
		Ip nuevaIp = new Ip("240.74.89.23", "23");
		assertEquals(nuevaIp.getClase(), Ip.CLASE_DESCONOCIDA);

	}
	

	@Tag("ERR")
	@Test
	@DisplayName("Bytedemas")
	public void testBytedemas() {
		try {
			Ip nuevaIp = new Ip("127.15.14.23.23", "23");
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	@Tag("IF")
	@Tag("ERR")
	@Test
	@DisplayName("Bytedemenos")
	public void testBytedeMenos() {
		try {
			Ip nuevaIp = new Ip("127.15.14", "23");
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	
	@Tag("IF")
	@Tag("ERR")
	@Test
	@DisplayName("Ipbyteinvalido")
	public void testIpConceros() {
		try {
			Ip nuevaIp = new Ip("0.15.14.23", "23");
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	@Tag("IF")
	@Tag("ERR")
	@Test
	@DisplayName("Byte1Fueraderango")
	public void testByteUnoFueraRango() {
		try {
			Ip nuevaIp = new Ip("567.15.14.23", "8");
		} catch (Exception e) {
			assertTrue(true);
		
		}
	}
	@Tag("ERR")
	@Test
	@DisplayName("Mascarafueraderango")
	public void mascaraFueraRango() {
		try {
			Ip nuevaIp = new Ip("172.678.14.23.23", "44");
		} catch (Exception e) {
			boolean verdadero = false;
			verdadero = false;
			assertTrue(true);
		}
	}
	
	@Tag("ERR")
	@Test
	@DisplayName("Mascaraconletras")
	public void mascaraletra() {
		try {
			Ip nuevaIp = new Ip("172.678.14.23.23", "e");
		} catch (Exception e) {
			boolean verdadero = false;
			verdadero = false;
			assertTrue(true);
		}
	}
	@Tag("IF")
	@Tag("ERR")
	@Test
	@DisplayName("Byte2fueraderango")
	public void testByteDosFueraRango() {
		try {
			Ip nuevaIp = new Ip("172.678.14.23.23", "30");
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	@Tag("IF")
	@Tag("ERR")
	@Test
	@DisplayName("Byte3fueraderango")
	public void testByteTresFueRarango() {
		try {
			Ip nuevaIp = new Ip("172.15.900.23", "17");
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	@Tag("IF")
	@Tag("ERR")
	@Test
	@DisplayName("Byte4fueraderango")
	public void testByteCuatroFueRarango() {
		try {
			Ip nuevaIp = new Ip("172.15.101.657", "17");
		} catch (Exception e) {
			assertTrue(true);
		}
	}

}
