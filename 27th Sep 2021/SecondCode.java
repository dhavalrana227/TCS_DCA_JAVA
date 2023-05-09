/* 
Direction

input: NESW --> String
output: Returned Successfully

input: NNWESW
output: Not Returned Successfully
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        int n=0; int s=0; int w=0; int e=0;
        
        for(int i=0;i<str.length();i++){
            
            if(str.charAt(i)=='N')
                n++;
            else if(str.charAt(i)=='S')
                s++;
            else if(str.charAt(i)=='W')
                w++;
            else if(str.charAt(i)=='E')
                e++;
        }
        
        if(n==s && e==w)
            System.out.println("Returned Successfully");
        else
            System.out.println("Not Returned Successfully");
    }
}