
public class Solution {

	public static int countWords(String str){
	
		int words = 1;
        for( int i = 0; i < str.length() - 1; i++)
            if(str.charAt(i) == ' ')
                words++;
        return words;
	}
	

}

