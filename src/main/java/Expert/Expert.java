package Expert;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Expert {
//	public static String backwardsString() {
//
//	};
//	public static Array accendingArray(Array incoming) {
//
//	};

//	public static Array backwardsString( String incoming) {
//
//	};

	public static String[] seperateString(String incoming) {
		// String[] result = incoming.split(",");
		int startIndex = 0;
		String[] result = new String[0];
		do {
			result = Arrays.copyOf(result, result.length+1);
			int endIndex = incoming.indexOf(',', startIndex+1);
			if (endIndex > -1) {
				result[result.length-1] = incoming.substring(startIndex, endIndex);
				startIndex = endIndex+1;
			} else {
				// not found, so last item
				result[result.length-1] = incoming.substring(startIndex);
				startIndex = incoming.length();

			}
		} while (startIndex < incoming.length());

		return result;
	}

	public static int sumOfIntDigits(long incoming) {
		int result = 0;
		String[] split = String.valueOf(incoming).split("");

		System.out.print("Cross sum of " + incoming + " is: ");

		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
			if (i < split.length - 1) {
				System.out.print(" + ");
			}
		}
		System.out.print(" = ");

		for (int i = 0; i < split.length; i++) {
			result = result + Integer.parseInt(split[i]);
		}

		if (result > 9) {
			System.out.println(result);
			System.out.println("Needs to be cross summed again");
			return sumOfIntDigits(result);
		}
		else  {
			System.out.println(result);
			return result;
		}


	};

	public static String transformToRoman(int number){
		String[] roman = new String[] {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
		int[] arabic = new int[] {1,4,5,9,10,40,50,90,100,400,500,900,1000};
		String result = "";
		for (int i = arabic.length-1; i >= 0; i--) {
			while (number >= arabic[i]) {
				result = result + roman[i];
				number = number - arabic[i];
			}
		}
		System.out.println(result);
		return result;

	}

}
