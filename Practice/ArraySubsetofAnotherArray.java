/*

Array Subset of another Array

input

A[] = {1 2 3 4 5}
B[] = {1 2 3 }

output
Yes

*/
import java.util.*;
public class Main{
    
    static String getResult(int[] a,int[] b,int n,int m){
        
        int i=0;
        int j=0;
        
        while(i<n && j<m){
            
            if(b[j]==a[i]){
                a[i]=0;
                j++;
                i=0;
            }
            else{
                i++;
            }
            
            if(j==m && i==0)
                return "Yes";
        }
        
        return "No";
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[m];
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        
        System.out.println(getResult(a,b,n,m));
    }
}