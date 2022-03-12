package com.juaracoding.ujian3.Suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.juaracoding.ujian3.TestBangunKolam;
import com.juaracoding.ujian3.TestKonversiSuhu;


@RunWith(Suite.class)
@SuiteClasses({
	TestBangunKolam.class,
	TestKonversiSuhu.class
})
public class BangunKolamKonversiSuhuTest {

}