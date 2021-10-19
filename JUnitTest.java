import static org.junit.jupiter.api.Assertions.*; #提供靜態方法，執行測試案例的假設（相對assumeTrue（））
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.*;

class JUnitTest {
	
	static int number1;
	private Calculator calculator;

	#所有測試案例之前必須先執行（前提：靜態方法）
	@BeforeAll 
	static void initAll() {
		number1 = -1;
		
		System.out.println("The 8 test cases are going to run !!");
	}
	
	# @.Test之前必須先執行（前提：不可靜態方法）
	@BeforeEach
	void init() {
		number1 = 10;
		
		calculator = new Calculator();
		//System.out.println(calculator);
		System.out.println(this);
	}
	
	@Test #進行測試案例
	@DisplayName("addition1") #自訂測試案例的名稱
	void addition1() { 
		assumeTrue(number1 == 10); #執行測試案例的假設
		
		assertEquals(3, calculator.add(1, 2)); 
		#測試期望與實際是否相等（期望結果值，class（實際運算值））
		#成功執行，失敗忽略
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
	
	# @.Test之後執行（前提：不可靜態方法）
	@AfterEach
	void tearDown() {
		number1 = 0;
		
		System.out.println(this);
		calculator = null;
	}
	
	#所有測試案例之後執行（前提：靜態方法）
	@AfterAll
	static void tearDownAll() {
		number1 = -1;
		
		System.out.println("all test cases are performed");
	}
}
