public class Sort012{	

	public static void sort012(int[] arr){
		/* Your class should be named Sort012
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
        int first = 0, last = arr.length - 1;
        for (int i = 0; i < arr.length - 1;) {
            if (arr[i] == 0) {
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                i++;
            }
            else if (arr[i] == 2) {
                int temp = arr[i];
                arr[i] = arr[last];
                arr[last] = temp;
            }
            else {
                i++;
            }

        }
        
	}
}
