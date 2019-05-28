/**
 * 
 */
package Q2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Shimon and zohar
 *
 */
public class SquareEquationTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("Lets start!");
	}


	
	/**
	 * Test method for {@link Q2.SquareEquation#checkabc(double, double, double)}.
	 */
	
	@Test
	public void test1() {
		assertEquals(false, Q2.SquareEquation.checkabc(0, 0, 0));
	}
	@Test
	public void test2() {
		assertEquals(false, Q2.SquareEquation.checkabc(0, 0, 1));
	}
	
	
	@org.junit.Test(expected=SquareEquationException.class)
	public void test3() throws SquareEquationException {
		SquareEquation.sqEq(0,0,0);
		}
	
	@org.junit.Test(expected=SquareEquationException.class)
	public void test4Checkabc() throws SquareEquationException {
		SquareEquation.sqEq(0,0,1);
		}
	
	@org.junit.Test(expected=SquareEquationException.class)
	public void test5Checkabc() throws SquareEquationException {
		SquareEquation.sqEq(-2.3,5.1,-12.62);
		}

}
