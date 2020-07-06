package junit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	CalcTest.class,
	stringmap1.class
})

public class tester {
	
	public class AllTests {
		
	}
}