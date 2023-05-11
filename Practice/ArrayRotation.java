/*

Array Rotation clockwise and anti clockwise

*/

import java.util.*;
public class Main{
    
    static void getClockwiseRotation(int[] arr,int n,int d){
    
        for(int i=0;i<d;i++){
            int temp = arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
        }
        
        for(int i : arr)
            System.out.print(i+" ");
        
        System.out.println();
    }
    
    static void getAntiClockwiseRotation(int[] arr,int n,int d){
        
        for(int i=0;i<d;i++){
            int temp=arr[n-1];
            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        
        for(int i : arr)
            System.out.print(i+" ");
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int d = sc.nextInt();
        
        int[] a = new int[n];
        
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        getClockwiseRotation(a,n,d);
        
        getAntiClockwiseRotation(a,n,d);
        
        // System.out.println("Clockwise Rotation");
        // for(int i : clockwise)
        //     System.out.print(i+" ");
        
        // System.out.println("\n Anti Clockwise Rotation");
        // for(int i : aclockwise)
        //     System.out.print(i+" ");
    }
}