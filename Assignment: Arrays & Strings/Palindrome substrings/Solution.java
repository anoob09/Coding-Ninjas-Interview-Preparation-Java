public class PalindromeSubstrings {

	public static int countPalindromeSubstrings(String s) {
		int count = s.length();
        for( int i = 1; i <= s.length() - 2; i++ ){
            int j = i - 1, k = i + 1;
            while( j >= 0 && k < s.length())
                if(s.charAt(j) == s.charAt(k)){
                    count++;
                    j--;
                    k++;
                }else
                    break;
        }
        for( int i = 0; i < s.length()-1; i++){
            int mid1 = i, mid2 = i + 1;
            while( mid1 >= 0 && mid2 < s.length()){
                if(s.charAt(mid1) == s.charAt(mid2)){
                count++;
                mid1--;
                mid2++;
                }
                else
                    break;
            }
        }
        return count;
	}
}

