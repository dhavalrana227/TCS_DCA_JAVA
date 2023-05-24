/*

find minimum even number from array

input:
5
11 12 13 14 10

output:
10
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
        int count=0;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr[i]%2==0 && arr[i]<min)
                min=arr[i];
            else
                count++;
        }
        
        if(count == arr.length)
            System.out.println(-1);
        else
            System.out.println(min);
    }
}