public class PracticeProblem {

	// solution assumes the string is composed only of lowercase letters a-z

	public static int goodString(String s) {
		int[] firstIndex = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}; // for tracking first index of any letter
		int[] lastIndex = new int[26]; // for tracking second index of any letter
		for (int i = 0; i < s.length(); ++i) {
			if (firstIndex[s.charAt(i) - 97] == -1) firstIndex[s.charAt(i) - 97] = i; // if not already found in string, this is the first index
			else lastIndex[s.charAt(i) - 97] = i; // if already found in the string, set to last index found
		}
		int sol = 0;
		for (int i = 0; i < 26; ++i) { // go through parallel arrays
			if (lastIndex[i] != 0 && lastIndex[i] - firstIndex[i] + 1 > sol) sol = lastIndex[i] - firstIndex[i] + 1; // if more than one occurence of the letter exists in the string and its first and last indices have the greatest distance found so far, set it equal to sol
		}
		if (sol == 0) return -1; // no repeated letters
		else return s.length() - sol; // return the number of characters needed to be erased
	}

}
