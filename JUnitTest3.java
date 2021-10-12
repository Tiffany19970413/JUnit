import static java.time.Duration.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.*;

import org.junit.jupiter.api.Test;

public class JUnitTest3 {
	private final Calculator calculator = new Calculator();
	private final Person person = new Person("Jame", "Doe");
	
	@Test
	void standardAssertions() {
		assertEquals(2, calculator.add(1, 1));
		assertEquals(4, calculator.multi(2, 2), 
				"The optional failure message is now the last parameter");
		assertTrue('a' < 'b', () -> "Assertion messages can be lazily evaluated -- "
				+ "to avoid constructing complex messages unnecessarily.");
	}
}
