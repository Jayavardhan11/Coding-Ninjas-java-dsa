import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int n = arr.length;
        int a =0 ,b=0,c=0;
        for(int i =0 ; i<n ;i++){
            if(arr[i]==0) a++;
            if(arr[i]==1) b++;
            if(arr[i]==3) c++;
        }
        for(int i =0 ; i < a;i++){
            arr[i]=0;
        }
        for(int i = a ;i<a+b;i++){
            arr[i]=1;
        }for(int i = a+b;i<n;i++){
            arr[i]=2;
        }
        
        
    }
}
