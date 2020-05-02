
public class Solution {

	
	// input - input 2D array
	public static void wavePrint(int input[][]){
		int i = 0;
		for( int j = 0; j < input[0].length; j++){
                for( i = 0; i < input.length; i++)
                    System.out.print(input[i][j] + " ");
                j++;
                for( i = i - 1; i > -1; i--)
                    System.out.print(input[i][j] + " ");
        }
        
	}
	
}

