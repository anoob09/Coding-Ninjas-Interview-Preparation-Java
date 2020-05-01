import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int space = 0, j;
        for( int i = 1; i <= rows; i++){
            if( i <= (rows + 1) / 2){
                for( j = 1; j <= space; j++)
                    System.out.print(" ");
                space++;
                for( j = 1; j <= i; j++)
                    System.out.print("* ");
                System.out.println();
            }
            else{
                for( j = 3; j <= space; j++)
                    System.out.print(" ");
                space--;
                for( j = rows; j >= i; j--)
                    System.out.print("* ");
                System.out.println();
            }
        }
	}

}

