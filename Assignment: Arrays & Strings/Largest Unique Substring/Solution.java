public class solution {
	
	public static String findLargestUniqueSubstring(String str){
		/* Don't write main().
	     * Don't read input, it is passed as function argument.
	     * Return the answer.
	     * Taking input and printing output is handled automatically.
	     */
        int start = 0, end = 0;
        String largest_substring = "";
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            int index = temp.indexOf(str.charAt(i));
            if (index == - 1) {
                temp += str.charAt(i);
            }
            else if (index > - 1) {
                String new_string = temp.substring(index + 1);
                new_string += str.charAt(i);
                temp = new_string;
            }
            // System.out.println(temp);
            if (temp.length() > largest_substring.length()) {
                largest_substring = temp;
            }
        }
        return largest_substring;
	}

}
