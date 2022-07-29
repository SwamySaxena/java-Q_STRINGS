// Importing required functions
import java.util.*;

class RemoveDuplicates {
	// returns the remaining string without iterated characters
	static String removeDuplicates(char[] str) {
		if (str == null || str.length == 0 || str[0] == '\0') {
			return "";
		}

		int writeIndex = 0;
		for (int i = 0; i < str.length; i++) {
			boolean found = false;

			// this loop checks if current character already exists,
			// if found it breaks the loop
			for (int j = 0; j < writeIndex; j++) {
				if (str[i] == str[j]) {
					found = true;
					break;
				}
			}

			if (!found) {
				str[writeIndex] = str[i];
				writeIndex++;
			}
		}

		if (writeIndex != str.length) {
			// Returns string without duplicates
			String ansStr = String.valueOf(Arrays.copyOfRange(str, 0, writeIndex));
			return ansStr;
		} else {
			String ansStr = String.valueOf(str);
			return ansStr;
		}
	}

	public static void main(String[] args) {
		String str = "dabbac";
		System.out.println("1.     Before: " + str);
		char[] charStr = str.toCharArray();
		System.out.println("       After:  " + removeDuplicates(charStr));
		System.out.println(
				"\n-----------------------------------------------------------------------------------------------------\n");
		String str1 = "aabbbccdddeee";
		System.out.println("2.     Before: " + str1);
		charStr = str1.toCharArray();
		System.out.println("       After:  " + removeDuplicates(charStr));
		System.out.println(
				"\n-----------------------------------------------------------------------------------------------------\n");
		String str2 = "abcdef";
		System.out.println("3.     Before: " + str2);
		charStr = str2.toCharArray();
		System.out.println("       After:  " + removeDuplicates(charStr));
		System.out.println(
				"\n-----------------------------------------------------------------------------------------------------\n");
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Importing required functions
import java.util.*;

class RemoveDuplicates {
	static String removeDuplicates(char[] str) {
		HashSet<Character> check = new HashSet<>();
		String res = "";
		for(int i = 0; i<str.length; i++){
			if(!check.contains(str[i])){
				res = res + Character.toString(str[i]);
				check.add(str[i]);
			}
		}
		// TODO: Write - Your - Code
		return res;
	}
}
