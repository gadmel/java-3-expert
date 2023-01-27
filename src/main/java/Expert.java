import java.lang.reflect.Array;
import java.util.Arrays;

public class Expert {
//	public static String backwardsString() {
//
//	};
//	public static Array accendingArray(Array incoming) {
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

//	public int sumOfIntDigits(int incoming) {
//
//	};
//
//	public int transformToRoman(int incoming) {
//
//	};

}
