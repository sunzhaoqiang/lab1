package yunsuan;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class First1Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSimplify() {
		String str;
		str=First1.simplify("x*y*z","!simpllli x=2" );
		assertEquals(null,str);
	}
	@Test
	public void testSimplify1() {
		String str;
		str=First1.simplify("x*y*z","!simplify" );
		assertEquals("x*y*z",str);
	}
	@Test
	public void testSimplify2() {
		String str;
		str=First1.simplify("x*y*z","!simplify x=2" );
		assertEquals("2*y*z",str);
	}
	@Test
	public void testSimplify3() {
		String str;
		str=First1.simplify("x*y*z","!simplify x=1 y=2" );
		assertEquals("1*2*z",str);
	}

}
