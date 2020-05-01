import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int space = 2 * ( rows - 1), j;
        for( int i = 1; i <= rows; i++){
            for( j = 1; j <= i; j++)
                System.out.print(j);
            for( j = 1; j <= space; j++)
                System.out.print(" ");
            space-= 2;
            for( j = i; j > 0; j--)
                System.out.print(j);
            System.out.println();
        }
	}
}

