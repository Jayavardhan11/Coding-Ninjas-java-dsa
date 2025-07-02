import java.util.* ;
import java.io.*; 
public class Solution {
  public static int sumOfMaxMin(int[] arr, int n) {
      // Write your code here.
      Arrays.sort(arr);
	if(n==1){
		return arr[0]+arr[0];
	}
	return arr[n-1]+arr[0];
  }
}
