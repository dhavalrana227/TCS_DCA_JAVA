/*
input : 3 (number of array elements)
        1 2 0 
output : 1 0 2 (First print all 1's then 0's and at last 2's)

input2 : 6
         0 1 2 0 1 2
         
output2 : 1 1 0 0 2 2
*/

import java.util.*;
public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int c0=0; int c1=0; int c2=0;        
        for(int i=0;i<n;i++){
            
            if(arr[i] == 0)
                c0++;
            else if(arr[i]==1)
                c1++;
            else if(arr[i]==2)
                c2++;
        }
        
        for(int i=0;i<c1;i++){
            System.out.print("1"+" ");
        }
        for(int i=0;i<c0;i++){
            System.out.print("0"+" ");
        }
        for(int i=0;i<c2;i++){
            System.out.print("2"+" ");
        }
    }
}