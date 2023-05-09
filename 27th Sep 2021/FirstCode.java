/* 
if the digit sum result is 1 print UNO if the digit sum is not 1 display NOT UNO.

input: 51112 ---> N
output: UNO

5+1+1+1+2=10  1+0=1
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int val=0;
        while(n>0){
            int rem=n%10;
            val=val+rem;
            n/=10;
        }
        
        if(val%9==1){
            System.out.println("UNO");
        }
        else{
            System.out.println("NOT UNO");
        }
    }
}