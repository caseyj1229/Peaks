import java.util.*;

public class Peaks {
    public static int solution(int[] A){
        //First find the index of all the peaks
        ArrayList<Integer> peaks = new ArrayList<Integer>();
        for(int i = 1; i < (A.length -1); i++){
            if(A[i] > A[i-1] && A[i] > A[i+1]){
                peaks.add(i);
            }
        }

        for(int j = 1; j <= A.length; j++){
            //If the array A cannot be seperated equally into j parts, it can be skipped
            if(A.length % j != 0){
                continue;
            }

            //After determining the size candidate, j, is valid
            //check that each block would have a peak
            int groups = A.length/j;
            boolean containsPeak = true;
            int peakFound = 0;
            for(int peak: peaks){
                //If the current peak is not in the size candidate j, no peak is found
                if(peak/j > peakFound){
                    containsPeak = false;
                    break;
                }
                //If the peak is found, increment peakFound
                else if(peak/j == peakFound){
                    peakFound++;
                }
            }
            //if peaks found != number of groups, not valid
            if(peakFound != groups){
                containsPeak = false;
            }
            //The first group that is found meeting the criteria will return
            if(containsPeak){
                return groups;
            }
        }
        //Return 0 for edge cases that cannot be divided equally and contain peaks
        return 0;
    }
}
