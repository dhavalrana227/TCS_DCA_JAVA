/*

write a program to find the number N whose power of 4 ends with number itself.

input: 5
output: True

input: 4
output: False

input: -5
output: Wrong Input
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        if(num<0){
            System.out.println("Wrong Input");
        }
        else{
        
            int res = (int)Math.pow(num,4);
            
            int temp=0;
    
            while(res>0){
                int rem = res%10;
                temp=rem;
                break;
            }
            
            if(num == temp)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}