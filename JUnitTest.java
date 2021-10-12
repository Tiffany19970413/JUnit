import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.*;

class JUnitTest {
	
	static int number1;
	private Calculator calculator;
	
	@BeforeAll
	static void initAll() {
		number1 = -1;
		
		System.out.println("The 8 test cases are going to run !!");
	}
	
	@BeforeEach
	void init() {
		number1 = 10;
		
		calculator = new Calculator();
		//System.out.println(calculator);
		System.out.println(this);
	}
	
	@Test
	@DisplayName("addition1")
	void addition1() {
		assumeTrue(number1 == 10);
		
		assertEquals(3, calculator.add(1, 2));
	}
	@DisplayName("addition2")
	@Test
	void addition2() {
		assumeTrue(number1 == 10);
		
		assertEquals(5, calculator.add(2, 3));
	}
	
	@Test
	@DisplayName("subtraction1")
	@Disabled()
	void subtraction1() {
		assumeTrue(number1 == 10);
		
		assertEquals(3, calculator.minus(6, 3));
	}
	@Test
	@DisplayName("subtraction2")
	@Disabled()
	void subtraction2() {
		assumeTrue(number1 == 10);
		
		assertEquals(6, calculator.minus(8, 2));
	}
	
	@Test
	@DisplayName("multiply1")
	void multiply1() {
		assumeTrue(number1 == 10);
		
		assertEquals(6, calculator.multi(2, 3));
	}
	@Test
	@DisplayName("multiply2")
	void multiply2() {
		assumeTrue(number1 == 10);
		
		assertEquals(12, calculator.multi(4, 3));
	}
	
	@Test
	@DisplayName("division1")
	@Disabled()
	void division1() {
		assumeTrue(number1 == 10);
		
		assertEquals(2, calculator.div(8, 4));
	}
	@Test
	@DisplayName("division2")
	@Disabled()
	void division2() {
		assumeTrue(number1 == 10);
		
		assertEquals(6, calculator.div(18, 3));
	}
	
	@AfterEach
	void tearDown() {
		number1 = 0;
		
		System.out.println(this);
		calculator = null;
	}
	
	@AfterAll
	static void tearDownAll() {
		number1 = -1;
		
		System.out.println("all test cases are performed");
	}
}
