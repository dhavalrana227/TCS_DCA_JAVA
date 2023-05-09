/*

move all zeros to end of the array

input: 1 0 2 0 3
output: 1 2 3 0 0 

*/

import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] a = new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        int ind=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0)
                a[ind++]=a[i];
        }
        
        while(ind<n)
            a[ind++]=0;
            
        for(int i : a)
            System.out.print(i+"\t");
    }
}