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

	public static String[] seperateString( String incoming) {
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

	public static int sumOfIntDigits(int incoming) {
		String result = "";
		int resultInt = 0;

		String[] split = String.valueOf(incoming).split("");

		System.out.print("Cross sum of " + incoming + " is: ");

		for (int i = 0; i < split.length; i++) {
			result = split[i];
			System.out.print(split[i]);

			if (i < split.length - 1) {
				System.out.print(" + ");
				result = result + split[i];

			}
		}
		System.out.print(" = ");

		for (int i = 0; i < split.length; i++) {
			resultInt = resultInt + Integer.parseInt(split[i]);
		}


		if (resultInt > 9) {
			System.out.println(resultInt);
			System.out.println("Needs to be cross summed again");
			sumOfIntDigits(resultInt);
		}
		else  {
			System.out.println(resultInt);
			return resultInt;
		}
		return resultInt;

	};

}
