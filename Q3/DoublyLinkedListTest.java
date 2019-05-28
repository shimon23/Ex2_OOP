/**
 * 
 */
package Q3;

import static org.junit.Assert.*;

import java.util.ListIterator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Shimon and zohar
 *
 */
public class DoublyLinkedListTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("The Test is Strting!");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("");
	}

	@Test
	public void test() {
		DoublyLinkedList<String> a = new DoublyLinkedList<String>();
		a.add("a");
		assertNotNull(a);	
	}
	}

