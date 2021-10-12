import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("When boolean is fales")
class JUnitTest4number2 {

	@Test
	@DisplayName("Should be false")
	void shouldBeFalse() {
		assertFalse(false);
	}
}
