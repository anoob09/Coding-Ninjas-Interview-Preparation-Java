import java.util.Arrays;
public class Solution {

	public static int platformsNeeded(int arrival[], int departure[]){
	    int plat = 0, mplat = 0;
        int i = 0, j = 0;
        Arrays.sort(arrival);
        Arrays.sort(departure);
        while( i < arrival.length && j < departure.length){
            if(arrival[i] < departure[j]){
                plat++;
                i++;
                if(plat > mplat)
                    mplat = plat;
            }
            else{
                plat--;
                j++;
            }
        }
        return mplat;
	}
	
}

