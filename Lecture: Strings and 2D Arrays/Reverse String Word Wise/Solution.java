public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
        int j = input.length();
        String str2 = "";
        int i;
        for( i = input.length() - 1; i > -1; i--)
            if(input.charAt(i) == ' '){
                str2 = str2 + input.substring(i + 1, j) + " ";
                j = i;
            }
        str2 = str2 + input.substring(0, j);
        return str2;
	}
}

