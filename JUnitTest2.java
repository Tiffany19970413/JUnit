import static java.time.Duration.ofMillis; #因為無法確定外部class是否可用，所以導入「超時屬性」測試（以毫秒為單位）
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.*; #強制超時測試

import java.util.concurrent.CountDownLatch; #多執行緒測試

import org.junit.jupiter.api.Test;

class JUnitTest2 {
	
	private final Calculator calculator = new Calculator();
	
	private final Person person = new Person("Jane", "Doe");
	
	@Test
	void standardAssertions() {
		assertEquals(2, calculator.add(1, 1));
		assertEquals(4, calculator.multi(2, 2), 
				"The optional failure message is now the last parameter");
		//asserEquals兩兩比較(實際值與預期值)，印出顯示文字
		assertTrue('a' < 'b', () -> "Assertion messages can be lazily evaluated -- "
				+ "to avoid constructing complex messages unnecessarily.");
		//asserTrue單一比較值(類似布林概念，實際值與預期值)，印出顯示文字
	}
	
	@Test
	void groupedAssertions() {
		assertAll("Person", 
				() -> assertEquals("Jane", person.getFirstName()),
				() -> assertEquals("Doe", person.getLastName())
				//因為一個function只能寫入一個asserEquals
				//所以開asserAll讓同個function執行多個測試
				//()->interface的簡寫
		);
	}

}
