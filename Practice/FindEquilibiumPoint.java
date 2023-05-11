/*

Equilibrium Point in array

input

n=5
1 3 5 2 2 

output
3 (1-based index)

*/ 

import java.util.*;
public class Main{
    
    static int getEquilibiriumPoint(int[] A,int n){
        
        int sum1=0;
        int sum2=0;
        int ind=-1;
        
        if(n==1)
            return 1;
        
        for(int i=0;i<n;i++){
            sum1+=A[i];
        }
        
        for(int i=1;i<n;i++){
            sum2+=A[i-1];
            
            System.out.println("Sum1 :"+sum1+" Sum2 :"+sum2+" A[i] :"+A[i]);
            if(sum1-sum2-A[i]==sum2){
                ind=i;
                break;
            }            
            System.out.println("Sum1 :"+sum1+" Sum2 :"+sum2+" A[i] :"+A[i]);

        }
        
        return ind == -1 ? -1 : ind+1;
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] a = new int[n];
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        System.out.println(getEquilibiriumPoint(a,n));
    }
}