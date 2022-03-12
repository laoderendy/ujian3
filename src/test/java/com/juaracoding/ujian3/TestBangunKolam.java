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
public class TestBangunKolam {
	
	BangunKolam bangunKolam;
	double p;
	double l;
	double t;
	
	static final Logger log = getLogger(lookup().lookupClass());
	
	@Before
	public void setUp() throws Exception {
		bangunKolam = new BangunKolam();	
		
	}
	
	@Test
	public void testkelilingKolam() {
		log.debug("Testing 1");
		System.out.println("Testing Angka 1");	
		
		double actual = bangunKolam.kelilingKolam(7, 12, 1);
		double expect = 80;
		assertEquals(expect, actual,0.0);
		
		}
	
	@Test
	public void testkelilingKolamHuruf() {
		log.debug("Testing 2");
		System.out.println("Testing Bukan Angka 2");
		
		String rumusKolamHuruf = "A";
		double convert = Double.parseDouble(rumusKolamHuruf);
		
		double actual = bangunKolam.kelilingKolam(convert,convert,convert);
		
		String expect = "A";
		assertEquals(Double.parseDouble(expect), actual, 0.0);
		
		}
	
	@Test
	public void testnegativeKolam() {
		log.debug("Testing 3");
		System.out.println("Testing Negative 3");
		
		double actual = bangunKolam.kelilingKolam(7, -12, -1);
		
		assertEquals(80, actual, 0.0);
		
		}
	
	
	@Test
	public void testKolamnull() {
		log.debug("Testing 4");
		System.out.println("Testing Null 4");
		
		double p = 0;
		Double pNull = null;
		
		double l = 0;
		Double lNull = null;
		
		double t = 0;
		Double tNull = null;
		
		double actual = bangunKolam.kelilingKolam(p,l,t);
		
		assertNull(pNull, lNull, tNull);
		assertEquals(0, actual, 0.0);
		
		}
	
	private void assertNull(Double pNull, Double lNull, Double tNull) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testvolumeKolam() {
		log.debug("Testing 5");
		System.out.println("Testing 5");
		
		double actual = bangunKolam.volumeKolam(7, 12, 1);
		double expect = 84;
		assertEquals(expect, actual,0.0);
	
	}
	
	@Test
	public void testvolumeHuruf() {
		log.debug("Testing 6");
		System.out.println("Testing 6");
		
		String rumusKolamHuruf = "A";
		double convert = Double.parseDouble(rumusKolamHuruf);
		
		double actual = bangunKolam.volumeKolam(convert,convert,convert);
		
		String expect = "A";
		assertEquals(Double.parseDouble(expect), actual, 0.0);
		
		}
	
	@Test
	public void testnegativevolumeKolam() {
		log.debug("Testing 7");
		System.out.println("Testing 7");
		
		double actual = bangunKolam.volumeKolam(7, -12, -1);
		
		assertEquals(80, actual, 0.0);
		
		}
	
	@Test
	public void testvolumeKolamnull() {
		log.debug("Testing 8");
		System.out.println("Testing 8");
		
		double p = 0;
		Double pNull = null;
		
		double l = 0;
		Double lNull = null;
		
		double t = 0;
		Double tNull = null;
		
		double actual = bangunKolam.volumeKolam(p,l,t);
		
		assertNull(pNull, lNull, tNull);
		assertEquals(0, actual, 0.0);
	
}
}

	
