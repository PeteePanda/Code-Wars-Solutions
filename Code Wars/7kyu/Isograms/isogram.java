package Isograms;
public class isogram {
	public static boolean  isIsogram(String str) {
		String compare = str.toLowerCase();
		char letter;
		for (int i = 0; i < str.length(); i++) {
			letter = compare.charAt(i);
			for (int j = i + 1; j < str.length(); j ++) {
				if (compare.charAt(j) == letter) {
					return false;
				}
			}
		}
		return true;
	} 
}