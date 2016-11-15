package yunsuan;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class First1Test {
	public static First1 test = new First1();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testExpression() {
		String str;
		str=First1.expression("3+2");
		assertEquals("3+2",str);
	}
	@Test
	public void testExpression1() {
		String str;
		str=First1.expression("3*x");
		assertEquals("3*x",str);
	}
	@Test
	public void testExpression2() {
		String str;
		str=First1.expression("3*x+2*y");
		assertEquals("3*x+2*y",str);
	}
	@Test
	public void testExpression4() {
		String str;
		str=First1.expression("3+ 2");
		assertEquals(null,str);
	}
	@Test
	public void testExpression5() {
		String str;
		str=First1.expression("-3*x");
		assertEquals(null,str);
	}
	@Test
	public void testExpression6() {
		String str;
		str=First1.expression("3x");
		assertEquals(null,str);
	}
}
