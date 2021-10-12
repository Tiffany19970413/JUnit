import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest4number4 {
	
	@Test
	@DisplayName("Should not be null")
	void shouldNotBeNull() {
		assertNotNull(new Object());
	}
}
