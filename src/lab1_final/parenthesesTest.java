package lab1_final;

import static org.junit.Assert.*;

import org.junit.Test;

public class parenthesesTest {

	@Test
	public void test() throws Exception {
		Expr expr1 = new Expr("3x+45");
		String result = expr1.Derivative("!d/dx");
		assertEquals("3.0",result);
	}
	@Test
	public void test2() throws Exception {
		Expr expr1 = new Expr("3x*y*z+45");
		String result = expr1.Derivative("!d/dx");
		assertEquals("3.0*y*z",result);
	}
	@Test
	public void test3() throws Exception {
		Expr expr1 = new Expr("x^2*y*5");
		String result = expr1.Derivative("!d/dx");
		assertEquals("10.0*x*y",result);
	}
	@Test
	public void test4() throws Exception {
		Expr expr1 = new Expr("3x+y");
		String result = expr1.Derivative("!d/d3");
		assertEquals("Error! Variable not found.",result);
	}
	@Test
	public void test5() throws Exception {
		Expr expr1 = new Expr("3x+y");
		String result = expr1.Derivative("!d/d");
		assertEquals("Please input one variable!",result);
	}
	@Test
	public void test6() throws Exception {
		Expr expr1 = new Expr("3x+y");
		String result = expr1.Derivative("!d/dx y");
		assertEquals("Error! Variable not found.",result);
	}
	@Test
	public void test7() throws Exception {
		Expr expr1 = new Expr("3x+y");
		String result = expr1.Derivative("!d/dz");
		assertEquals("Error! Variable not found.",result);
	}
}
