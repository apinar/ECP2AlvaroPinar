package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	private Fraction fr;
	
	@Test
	public void testFractionIntInt() {
	    fr = new Fraction(17, 5);
        assertEquals(17, fr.getNumerator());
        assertEquals(5, fr.getDenominator());
    }
	
	@Test
	public void testFraction() {
        fr = new Fraction();
        assertEquals(1, fr.getNumerator());
        assertEquals(1, fr.getDenominator());
    }
	
	
	@Test
	public void testDecimal() {
	    fr = new Fraction(17, 5);
        assertEquals(3.4, fr.decimal(),10^-2);
    }
	
	
	@Test
	public void testIsPropia() {
	    fr = new Fraction(17, 5);
	    assertEquals(true, fr.isPropia());
    }
	
	@Test
	public void testMultiply(){
	    fr = new Fraction(17, 5);
		Fraction fr2 = new Fraction(1, 2);
		Fraction resultado = this.fr.multiply(fr2);
		
		assertEquals(17, resultado.getNumerator());
		assertEquals(10, resultado.getDenominator());
	}
	
}
