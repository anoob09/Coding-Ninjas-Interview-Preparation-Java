public class solution {

	public static void spiralPrint(int matrix[][]){
		// Write your code here
        int first_row = 0, first_column = 0, last_row = matrix.length - 1, last_column = matrix[0].length - 1;
        while (first_column <= last_column) {
            for (int i = first_column; i <= last_column; i++) {
                System.out.print(matrix[first_row][i] + " ");
            }
            first_row++;
            for (int i = first_row; i <= last_row; i++) {
                System.out.print(matrix[i][last_column] + " ");
            }
            last_column--;
            if (first_column <= last_column && first_column <= last_column) {
                for (int i = last_column; i >= first_column; i--) {
                    System.out.print(matrix[last_row][i] + " ");
                }
                last_row--;
            }
            for (int i = last_row; i >= first_row; i--) {
                System.out.print(matrix[i][first_column] + " ");
            }
            first_column++;
        }
	}
}
