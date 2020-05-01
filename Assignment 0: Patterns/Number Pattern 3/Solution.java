import java.util.Scanner;
public class Solution {

	public static void printPattern(int n){
        int rows = n;
        int j;
        for(int i = 0; i < (2 * rows) - 1; i++){
            for( j = 0; j < ( 2 * rows) - 1; j++){
                int min = Math.min(i, j);
                min = Math.min(min, ((2 * rows) - 1) - i - 1);
                min = Math.min(min, ((2 * rows) - 1) - j - 1);
                System.out.print(rows - min + " ");
            }
            System.out.println();
        }
	}
}

