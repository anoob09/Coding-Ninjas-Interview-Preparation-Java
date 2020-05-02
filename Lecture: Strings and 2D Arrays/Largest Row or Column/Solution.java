
public class Solution {

	
	public static void findLargest(int input[][]){
		
		int sum = 0, index = 0, maxsum = 0;
        String str  = "";
        for(int i = 0; i < input.length; i++){
            for( int j = 0; j < input[0].length; j++)
                sum = sum + input[i][j];
            if( sum > maxsum){
                maxsum = sum;
                index = i;
                str = "row";
            }
            sum = 0;
        }
        for( int i = 0; i < input[0].length; i++){
            for( int j = 0; j < input.length; j++)
                sum = sum + input[j][i];
            if( sum > maxsum){
                maxsum = sum;
                index = i;
                str = "column";
            }
            sum = 0;
        }
        System.out.print(str + " " + index + " " + maxsum);
	}

	
}

