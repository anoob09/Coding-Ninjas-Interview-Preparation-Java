import java.util.*;
public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
        String str[] = input.split(" ");
        String s = "";
        for( int i = str.length - 1; i > -1; i--)
            s = s + str[i] + " ";
        return s;
	}
}

