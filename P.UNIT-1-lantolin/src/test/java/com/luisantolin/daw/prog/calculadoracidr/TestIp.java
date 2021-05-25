package com.luisantolin.daw.prog.calculadoracidr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;



public class TestIp {
	@Tag("LIM")
	@Test
	public void getMascara() {
		Ip mascara = new Ip("127.15.14.23", "23");
		mascara.getMascara();
		assertEquals(mascara.getMascara(), 23);
	}

	@Tag("IF")
	@Test
	public void claseA() {
		Ip nuevaIp = new Ip("127.15.14.23", "23");
		nuevaIp.getClase();
		assertEquals(nuevaIp.getClase(), Ip.CLASE_A);
		

	}
	

	@Tag("IF")
	@Test
	public void claseB() {
		Ip nuevaIp = new Ip("191.15.14.23", "23");
		nuevaIp.getClase();
		assertEquals(nuevaIp.getClase(), Ip.CLASE_B);

	}

	@Tag("IF")
	@Test
	public void claseC() {
		Ip nuevaIp = new Ip("222.15.14.23", "23");
		nuevaIp.getClase();
		assertEquals(nuevaIp.getClase(), Ip.CLASE_C);

	}
	
	@Tag("IF")
	@Test
	public void claseD() {
		Ip nuevaIp = new Ip("230.15.14.23", "23");
		nuevaIp.getClase();
		assertEquals(nuevaIp.getClase(), Ip.CLASE_D);
	}

	@Tag("IF")
	@Test
	public void claseDesconocida() {
		Ip nuevaIp = new Ip("300.15.14.23", "23");
		nuevaIp.getClase();
		assertEquals(nuevaIp.getClase(), Ip.CLASE_DESCONOCIDA);

	}

	@Tag("ERR")	
	@Test
	public void testByte1() {
		Ip byte1 = new Ip("127.15.14.23", "23");
		byte1.getBit(127);
		assertTrue(byte1.getBit(127));
	}

	@Tag("ERR")
	@Test
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
	public void testLetras() {
		try {
			Ip nuevaIp = new Ip("127.15.14.g", "23");
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	@Tag("IF")
	@Tag("ERR")
	@Test
	public void testMascaraMayor() {
		try {
			Ip nuevaIp = new Ip("127.15.14.23", "45");
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	@Tag("IF")
	@Tag("ERR")
	@Test
	public void testMascaraMenor() {
		try {
			Ip nuevaIp = new Ip("127.15.14.23", "-1");
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	@Tag("IF")
	@Tag("ERR")
	@Test
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
	public void testByteUnoFueraRango() {
		try {
			Ip nuevaIp = new Ip("567.15.14.23", "8");
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	@Tag("IF")
	@Tag("ERR")
	@Test
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
	public void testByteCuatroFueRarango() {
		try {
			Ip nuevaIp = new Ip("172.15.101.657", "17");
		} catch (Exception e) {
			assertTrue(true);
		}
	}

}
