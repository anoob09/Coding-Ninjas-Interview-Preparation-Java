public class PushZerosAtEnd {
	
	public static void pushZerosAtEnd(int[] arr){
		/* Your class should be named PushZerosAtEnd 
		 * Don't write main().
	         * Don't read input, it is passed as function argument.
     		 * No need to return or print the output.
     		 * Taking input and printing output is handled automatically.
     		 */
        int non_zero = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[non_zero];
                arr[non_zero] = temp;
                non_zero++;
            }
        }
	}
}
