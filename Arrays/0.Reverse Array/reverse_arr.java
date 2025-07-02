import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here
        int start  = m + 1;
        int end  = arr.size()-1;
        while(start <= end){
            int a =arr.get(start);
            int b = arr.get(end);
            arr.set(start, b);
            arr.set(end,a );
            start++;
            end--;
        }
        
    }
}
