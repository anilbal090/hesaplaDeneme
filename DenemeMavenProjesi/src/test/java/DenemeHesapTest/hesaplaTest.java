package DenemeHesapTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;

import DenemeHesap.hesapla;

public class hesaplaTest {
	static void testToplama() {
		int gercek = hesapla.topla(8, 2);
		assertEquals(10, gercek);
		
	}

}
