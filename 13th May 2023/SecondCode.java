/*

write a program to find Nth largest element in array

input: 5 (num of elements)
       10 20 30 40 50
       3 (Nth largest item)
     
output: 30
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
        
        int c = sc.nextInt();
        
        Arrays.sort(arr);
    
        System.out.println(arr[arr.length-c]);
        
        
    }
}