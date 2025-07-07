import java.util.* ;
import java.io.*; 
public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
           // Write your code here.
        int nums[] =new int[n];
        for(int i = 0 ; i < n;i++){
            nums[i]=arr.get(i); 
        }

        int[] ans= {-1,-1};
        ans[0] = search(nums,k, true);
        if(ans[0] != -1){
            ans[1] = search(nums,k,false);
        }
        return ans;
    }
    public static int search(int[] nums,int tar,boolean findStartIndex){
        int ans = -1;
        int start =0,end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(tar < nums[mid]){
                end = mid -1 ;
            }
            else if(tar > nums[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(findStartIndex){
                    end = mid - 1 ;
                }else{
                    start = mid  + 1 ;
                }
            }
        }
        return ans;
    }

};
