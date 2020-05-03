import java.util.*;
public class Solution {

	public static String breakWords(String input){
    int start = 0, end = 0;
	    String space = " ";
	    int len = 0;
        for( int i = 0; i < input.length(); i++){
            if( input.charAt(i) == ' '){
                end = i;
                len  = start == 0 ? end - start - 2 : end - start - 1;
                if(len % 2 ==  0 && len >= 4){
                    int mid = start + ((end - start + 1)/2);
                    input = input.substring(0, mid) + space + input.substring(mid);
                    end++;
                }
                start = end;
            }
        }
        if( (input.length() - start - 1) % 2 == 0 && (input.length() - start - 1) >= 4){
            int mid = start + ((input.length() - start + 1)/2);
            input = input.substring(0, mid) + space + input.substring(mid);
        }
        return input;
    }
	
}

