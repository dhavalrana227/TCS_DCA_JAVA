/* DCA 22nd March 
input a = {2,3,4,5,6}
      b = {3,4,9,8,7,5}
      
output 2 6 */

import java.util.*;
public class FirstCode{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] ar1 = new int[n];
        int[] ar2 = new int[m];
        
        for(int i=0;i<ar1.length;i++){
            ar1[i]=sc.nextInt();
        }
        
        for(int i=0;i<m;i++){
            ar2[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            int f=0;
            for(int j=0;j<m;j++){
                if(ar1[i] == ar2[j]){
                    f=1;
                }
            }
            
            if(f==0)
                System.out.print(ar1[i]+" ");
        }
    }
}