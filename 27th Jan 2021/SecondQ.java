/*

multiply all digits

input : 1234
output : 24

input : 5432
output : 120

*/

import java.util.*;
public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int ans=1;
        while(num>0){
            int rem = num%10;
            ans = ans * rem;
            num/=10;
        }
        
        System.out.println(ans);
    }
}
