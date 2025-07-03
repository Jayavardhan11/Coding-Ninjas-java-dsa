import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int ans =Integer.MIN_VALUE;
		for(int i =0 ;i<n;i++){
			for(int j =i+1;j<n;j++){
				int curPro = 1;
				for(int k= i; k<j;k++){
					curPro *= arr.get(k);
					
				}
				if(curPro>ans){
						ans =curPro;
					}
					
				
			}
		
		}
		return ans;
	}
}
