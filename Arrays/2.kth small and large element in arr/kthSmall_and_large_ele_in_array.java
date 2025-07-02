import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
        // Sort the array
        Collections.sort(arr);
        
        // Get kth smallest and kth largest
        int kthSmallest = arr.get(k - 1);
        int kthLargest = arr.get(n - k);
        
        // Return as a new ArrayList
        ArrayList<Integer> result = new ArrayList<>();
        result.add(kthSmallest);
        result.add(kthLargest);
        
        return result;
    }
}
