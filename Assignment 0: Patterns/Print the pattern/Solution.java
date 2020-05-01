
public class Solution {

	/* Input
	 * n - number of rows */
	public static void printPattern(int n){
        int x = 0;
        if( n % 2 == 0)
		for( int i = 1; i <= n; i++){
            if( i <= (n/2) ){
                for( int j = 1; j <= n; j++){
                    System.out.print(n * x + j +" ");
                }
                x = x + 2;
                System.out.println();
            }else if( i == (n/2) + 1){
                x--;
                for( int j = 1; j <= n; j++)
                    System.out.print( n * x + j + " ");
                System.out.println();
            }
            else{
                x--;
                for( int j = 1; j <= n; j++)
                    System.out.print(n * (x - 1) + j + " ");
                x--;
                System.out.println();
            }
        }
        if ( n % 2 == 1)
            for( int i = 1; i <= n; i++){
            if( i <= (n/2) + 1){
                for( int j = 1; j <= n; j++){
                    System.out.print(n * x + j +" ");
                }
                x = x + 2;
                System.out.println();
            }
            else{
                if( x > n)
                    x-= 2;
                x--;
                for( int j = 1; j <= n; j++)
                    System.out.print(n * x + j + " ");
                x--;
                System.out.println();
            }
        }

	}
	
}

