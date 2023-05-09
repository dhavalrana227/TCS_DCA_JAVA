/* 
Addative Presistance
Multiplicative Presistance

input: 1679583
       1+6+7+9+5+8+3=39
       3+9=12
       1+2=3
    continue till sum is less than 9 and count Presistance

output: 3
*/
import java.util.*;
public class Main{
    static int getMultiplicative(int n){
        
        int sum=1;
        while(n>0){
            int rem = n%10;
            sum*=rem;
            n/=10;
        }
        
        return sum;
    }
    static int getAddative(int n){
        
        int sum=0;
        while(n>0){
            int rem = n%10;
            sum+=rem;
            n/=10;
        }
        
        return sum;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int finalSum = getAddative(num);
        int c=1;
        while(finalSum>9){
            finalSum=getAddative(finalSum);
            c++;
        }
        
        System.out.println("Addative Presistance :"+c);
        
        int finalMul = getMultiplicative(num);
        int c1=1;
        
        while(finalMul>9){
            finalMul=getMultiplicative(finalMul);
            c1++;
        }
        
        System.out.println("Multiplicative Presistance :"+c1);
    }
}