package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
	private DecimalCollection dcol;
	
	@Before
    public void before() {
		dcol = new DecimalCollection();
        dcol.add(1.5);
        dcol.add(2.3);
        dcol.add(2.0);
    }

	@Test
	public void testSize() {
		assertEquals(3, dcol.size());
	}

	@Test
	public void testSum() {
		assertEquals(5.8, dcol.sum(),0);		
	}
	
	@Test
	public void testHigher() {
		assertEquals(2.3, dcol.higher(),0);
	}
}


