package junit;
//assign1
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
public class myunittest {
	@Test
	void testStringConcat() {
		MyUnit myUnit = new MyUnit();
		assertEquals("Result", "HelloWorld", myUnit.stringConcat("Hello", "World"));
	}
}
