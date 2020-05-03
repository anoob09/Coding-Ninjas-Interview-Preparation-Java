
public class Solution {

	
	// input - input 2D array
	public static void wavePrint(int input[][]){

        boolean top_to_bottom = true;
        int num_rows = input.length;
        for (int column = 0; column < input[0].length; column++) {
            if (top_to_bottom) {
                for (int i = 0; i < num_rows; i++) {
                    System.out.print(input[i][column] + " ");
                }
                top_to_bottom = false;
            }
            else {
                for (int i = num_rows - 1; i >= 0; i--) {
                    System.out.print(input[i][column] + " ");
                }
                top_to_bottom = true;
            } 
        }
	}

	
}

