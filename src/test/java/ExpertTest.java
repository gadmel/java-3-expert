import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExpertTest {

	@Test
	void backwardsString() {
	}

	@Test
	void accendingArray() {
	}

	@Test
	void seperateString() {
		String testString = "Hello,this,should,be,an,array";
		String[] result = Expert.seperateString(testString);
		String[] expected = new String[] {"Hello","this","should","be","an","array"};
		Assertions.assertArrayEquals(expected, result);
	}

	@Test
	void sumOfIntDigits() {
	}

	@Test
	void transformToRoman() {
	}
}