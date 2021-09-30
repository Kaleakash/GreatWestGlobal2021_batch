package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Operation;

public class OperationTest {
	@Test
	public void testAdd() {
		Operation op = new Operation();
		int result = op.add(100, 200);
		assertEquals(300, result);
	}
	@Test
	public void testSub() {
		Operation op = new Operation();
		int result = op.sub(100, 200);
		assertEquals(-100, result);
	}
	@Test
	public void testMul() {
		Operation op = new Operation();
		int result = op.mul(1, 2);
		assertEquals(2, result);
	}
	@Test
	public void testDiv() {
		Operation op = new Operation();
		int result = op.div(10, 2);
		assertEquals(5, result);
	}
}
