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
		String[] result = Expert.Expert.seperateString(testString);
		String[] expected = new String[] {"Hello","this","should","be","an","array"};
		Assertions.assertArrayEquals(expected, result);
	}

	@Test
	void seperateStringNothingToSepearte() {
		String testString = "Hello this should be an array";
		String[] result = Expert.Expert.seperateString(testString);
		String[] expected = new String[] {"Hello this should be an array"};
		Assertions.assertArrayEquals(expected, result);
	}

	@Test
	void sumOfIntDigits() {
		long testNumber = 569999999978L;
		int result = Expert.Expert.sumOfIntDigits(testNumber);
		int expected = 8;
		Assertions.assertEquals(expected, result);
	}
	@Test
	void sumOfIntDigitsWentWrong() {
		long testNumber = 1;
		int result = Expert.Expert.sumOfIntDigits(testNumber);
		int expected = 1;
		Assertions.assertEquals(expected, result);
	}

	@Test
	void transformToRoman() {
	}
}