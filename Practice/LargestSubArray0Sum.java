/*

Largest subarray with 0 sum

input

N = 8
A[] = {15,-2,2,-8,1,7,10,23}

output
5

The largest subarray with sum 0 will be -2 2 -8 1 7.
*/

import java.util.*;
public class Main{
    
    static int getMaxLength(int[] arr,int n){
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int i=-1;
        int sum=0;
        
        map.put(sum,i);
        
        int maxLen=0;
        
        while(i < arr.length -1){
            i++;
            
            sum+=arr[i];
            
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            else{
                int len = i - map.get(sum);
                if(len > maxLen)
                    maxLen=len;
            }
        }
        
        return maxLen;
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println(getMaxLength(arr,n));
    }
}
