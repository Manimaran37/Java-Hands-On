package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class countATest {

	@Test
	public void test() {
		JunitTest obj = new JunitTest();
		assertEquals(3, obj.countA("Manimaran"));
	}

}
