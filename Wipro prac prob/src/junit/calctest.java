package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class calctest {
	calc c = new calc();

	@Test
	public void testAdd() {
		assertEquals(5, c.add(10, -5));
		assertEquals(5, c.add(10, -5));
		assertEquals(5, c.add(20, -15));
		assertEquals(5, c.add(0,5));
	}

	@Test
	public void testSub() {
		assertEquals(5, c.sub(10,5));
		assertEquals(95, c.sub(100,5));
		assertEquals(5, c.sub(20,15));
		assertEquals(5,	c.sub(10,5));
	}

}