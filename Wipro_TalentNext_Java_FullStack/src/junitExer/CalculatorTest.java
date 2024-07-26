package junitExer;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		
		Calculator ob=new Calculator();
		assertEquals(5, ob.add(4, 1));
	}
	@Test
	public void testSub() {
		Calculator ob=new Calculator();
		assertEquals(3, ob.sub(4, 1));
	}

}
