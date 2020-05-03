public class solution {

	public static void spiralPrint(int matrix[][]){
		// Write your code here
        int i = 0, first_row = 0, first_col = 0;
        int last_row = matrix.length - 1, last_col = matrix[0].length - 1;
        while( first_row <= last_row && first_col <= last_col){
            for( i = first_col; i <= last_col; i++)
                System.out.print(matrix[first_row][i] + " ");
            first_row++;
            for( i = first_row ; i <= last_row; i++)
                System.out.print(matrix[i][last_col] + " ");
            last_col--;
            if(first_row <= last_row){
                for( i = last_col; i >= first_col; i--)
                    System.out.print(matrix[last_row][i] + " ");
                last_row--;
                for( i = last_row; i >= first_row; i--)
                    System.out.print(matrix[i][first_col] + " ");
                first_col++;
            }
        }


	}
}
