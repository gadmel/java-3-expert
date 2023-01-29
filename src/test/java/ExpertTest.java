import Expert.Expert;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.DisplayName;


//import static org.junit.jupiter.api.Assertions.*;

class ExpertTest {

	@Nested
	@DisplayName("String backwards spelling test")
	@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
	class	backwardsSpellingUseCases {

		@Test
		@Tag("backwardsSpellingTest")
		@Order(1)
		void backwardsString() {
			String testString = "Hello";
			String result = Expert.backwardsString(testString);
			String expected = "olleH";
			Assertions.assertEquals(expected, result, "The string was reversed, consists of a single character or is a complete palindrome");
		}

		@Test
		@Tag("backwardsSpellingTest")
		@Order(2)
		void backwardsStringNothingToReverse() {
			String testString = "step on no pets";
			String result = Expert.backwardsString(testString);
			String expected = "olleH";
			Assertions.assertFalse( result.equals(expected), "The string was not reversed");
		}
	}

	@Nested
	@DisplayName("Test of the int sort in an array")
	@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
	class	intSortUseCases {

		@Test
		@Tag("intSortTest")
		@Order(1)
		void accendingArray() {
			int[] testArray = new int[] {6, 2, 8, 3, 9, 6};
			int[] result = Expert.accendingArray(testArray);
			int[] expected = new int[] {2, 3, 6, 6, 8, 9};
			Assertions.assertArrayEquals(expected, result, "The array has been sorted successfully");
		}
		@Test
		@Tag("intSortTest")
		@Order(2)
		void accendingArrayThrowsFail() {
			int[] testArray = new int[] {6, 2, 8, 3, 9, 6};
			int[] result = Expert.accendingArray(testArray); // attention: accendingArray has altered the testArray
			Assertions.assertFalse( Arrays.toString(new int[] {6, 2, 8, 3, 9, 6}).equals(Arrays.toString(result)), "The array was not sorted");
		}
	}

	@Nested
	@DisplayName("Test of the split")
	@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
	class	splitUseCases {

		@Test
		@Tag("testOfTheSplit")
		@Order(1)
		void seperateString() {
			String testString = "Hello,this,should,be,an,array";
			String[] result = Expert.seperateString(testString);
			String[] expected = new String[] {"Hello","this","should","be","an","array"};
			Assertions.assertArrayEquals(expected, result, "The string should be split into an array by the comma");
		}

		@Test
		@Tag("testOfTheSplit")
		@Order(2)
		void seperateStringNothingToSepearte() {
			String testString = "Hello this should be an array";
			String[] result = Expert.seperateString(testString);
			String[] expected = new String[] {"Hello this should be an array"};
			Assertions.assertArrayEquals(expected, result, "The string is the same after the split because there is no comma");
		}
	}

	@Nested
	@DisplayName("Cross sum test")
	@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
	class	crossSumUseCases {

		@Test
		@Tag("crossSumTest")
		@Order(1)
		void sumOfIntDigits() {
			long testNumber = 569999999978L;
			int result = Expert.sumOfIntDigits(testNumber);
			int expected = 8;
			Assertions.assertEquals(expected, result, "The cross sum of 569999999978 should be 8");
		}

		@Test
		@Tag("crossSumTest")
		@Order(2)
		void sumOfIntDigitsWentWrong() {
			long testNumber = 569999999978L;
			int result = Expert.sumOfIntDigits(testNumber);
			int rightAnswer = 8;
			int wrongAnswer = rightAnswer + 1;
			Assertions.assertNotEquals(wrongAnswer, result, "The cross sum of 569999999978 should not be 9");
		}
	}

	@Nested
	@DisplayName("Test of the arabic to roman transform")
	@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
	class	transformToRomanUseCases {

		@Test
		@Tag("romanTest")
		@Order(1)
		void transformToRoman() {
			String roman = Expert.transformToRoman(5);
			String expected = "V";
			Assertions.assertEquals(expected, roman, "The number 5 should be V");
		}
		@Test
		@Tag("romanTest")
		@Order(2)
		void transformToRoman38() {
			String roman = Expert.transformToRoman(38);
			String expected ="XXXVIII";
			Assertions.assertEquals(expected, roman, "The number 38 should be XXXVIII");
		}
		@Test
		@Tag("romanTest")
		@Order(3)
		void transformToRoman84() {
			String roman = Expert.transformToRoman(84);
			String expected ="LXXXIV";
			Assertions.assertEquals(expected, roman, "The number 84 should be LXXXIV");
		}

		@Test
		@Tag("romanTest")
		@Order(4)
		void transformToRoman99() {
			String roman = Expert.transformToRoman(99);
			String expected ="XCIX";
			Assertions.assertEquals(expected, roman, "The number 99 should be XCIX");
		}
	}

}