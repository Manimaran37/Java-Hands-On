package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		JunitTest obj = new JunitTest();
		assertEquals(25, obj.square(5));
	}

}
