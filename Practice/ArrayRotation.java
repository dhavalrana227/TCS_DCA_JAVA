/* Rotate array

input : 5
        1 2 3 4 5
        3
        
output : 3 4 5 1 2 */

import java.util.*;
public class ArrayRotation{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int k = sc.nextInt();
        
        for(int i=0;i<k;i++){
            int temp=arr[n-1];
            //shift one element left to right 5 1 2 3 4 ....
            for(int j=n-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0]=temp;
        }
        
        for(int i : arr){
            System.out.print(i+"\t");
        }
        
    }
}