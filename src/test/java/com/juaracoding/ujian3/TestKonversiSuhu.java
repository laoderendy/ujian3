package com.juaracoding.ujian3;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.Assert.*;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestKonversiSuhu {
	
	KonversiSuhu konversiSuhu;
	int f;
	
	static final Logger log = getLogger(lookup().lookupClass());

	@Before
	public void setUp() throws Exception {
		
		konversiSuhu = new KonversiSuhu();
		
	}

	@Test
	public void testkonversi() {
		
		log.debug("Testing 1");
		System.out.println("Angka 1");
		
		int actual = konversiSuhu.koversiSuhu(23);
		
		assertEquals(-5, actual, 0.0);
		
	
		
	}
	
	@Test
	public void testkonversiHuruf() {
	
		log.debug("Testing 2");
		System.out.println("Bukan angka 2");		
		
		double actual = konversiSuhu.koversiSuhu(f);
		
		String expect = "A";
		
		assertEquals(Double.parseDouble(expect), actual, 0.0);
		
		
		
	}
	
	@Test
	public void testkonversinegative() {
		
		log.debug("Testing 3");
		System.out.println("Negative 3");	
		
		double actual = konversiSuhu.koversiSuhu(-68);
		
		assertEquals(20, actual, 0.0);
		
		}
	
	@Test
	public void testkonversinull() {
		
		log.debug("Testing 4");
		System.out.println("Null 4");	
		
		double f = 0;
		Double fNull = null;
		
		double actual = konversiSuhu.koversiSuhu(f);
		
		assertNull(fNull);
		assertEquals(0, actual, 0.0);
	
	}
	

		
}

