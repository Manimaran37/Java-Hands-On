import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitTest {
	int num;

	@Before
	public void setUp() throws Exception {  //Runs before the test
		num = 1;
	}

	@After
	public void tearDown() throws Exception {  //Runs after the test
		System.out.println("Test Completed");
	}

	@Test
	public void test() {
//		fail("Not yet implemented");
		assertEquals(num, JUnitTestClass.one());
	}

}
