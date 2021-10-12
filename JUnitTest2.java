import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.CountDownLatch;

import org.junit.jupiter.api.Test;

class JUnitTest2 {
	
	private final Calculator calculator = new Calculator();
	
	private final Person person = new Person("Jane", "Doe");
	
	@Test
	void standardAssertions() {
		assertEquals(2, calculator.add(1, 1));
		assertEquals(4, calculator.multi(2, 2), 
				"The optional failure message is now the last parameter");
		//asserEquals�����(��ڭȻP�w����)�A�L�X��ܤ�r
		assertTrue('a' < 'b', () -> "Assertion messages can be lazily evaluated -- "
				+ "to avoid constructing complex messages unnecessarily.");
		//asserTrue��@�����(�������L�����A��ڭȻP�w����)�A�L�X��ܤ�r
	}
	
	@Test
	void groupedAssertions() {
		assertAll("Person", 
				() -> assertEquals("Jane", person.getFirstName()),
				() -> assertEquals("Doe", person.getLastName())
				//�]���@��function�u��g�J�@��asserEquals
				//�ҥH�}asserAll���P��function����h�Ӵ���
				//()->interface��²�g
		);
	}

}
