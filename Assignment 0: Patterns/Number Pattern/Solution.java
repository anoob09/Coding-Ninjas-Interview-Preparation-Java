import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n - 1;
        int z, k;
        for(int i = 1; i <= n; i++){
            for(int j = s; j > 0; j--)
                System.out.print(" ");
            s--;
            z = 1;
            for( k = i; z <= i ; z++)
                System.out.print(k++);
            System.out.println();
        }
	}

}

