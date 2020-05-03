public class Solution {

	public static void leaders(int[] input) {
        int arr[] = new int[input.length];
        int j = 0;
        arr[j] = input[input.length - 1];
        j++;
        int max = input[input.length - 1];
        for( int i = input.length - 2; i > -1; i--)
            if(input[i] >= max){
                max = input[i];
                arr[j++] = input[i];
            }
        j--;
        while(j >  -1)
            System.out.print(arr[j--] + " ");
	}
	
}

