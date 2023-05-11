/*

subarray with given Sum

input: 
N = 5, S = 12
A[] = {1,2,3,7,5}

Output: 2 4
*/

import java.util.*;
public class Main{
    
    static ArrayList<Integer> getSum(int[] A,int n,int s){
        
        int sum=0;
        int j=0;
        
        ArrayList<Integer> list = new ArrayList<>();
        if(s==0){
            list.add(-1);
            return list;
        }
        
        for(int i=j;i<n;i++){
            sum+=A[i];
            
            if(sum == s){
                list.add(j+1);
                list.add(i+1);
                return list;
            }
            
            if(sum > s){
                sum-= (A[i]+A[j]);
                j++;
                i--;
            }
        }
        list.add(-1);
        return list;
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int s = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        ArrayList<Integer> as = getSum(arr,n,s);
        
        for(int i=0;i<as.size();i++){
            System.out.println(as.get(i)+" ");
        }
        
    }
}