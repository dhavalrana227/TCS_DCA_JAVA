/*

input: mama
output: 1

forward shift : amam
backward shift : amam

both equal print 1 otherwise 0
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        //forward shift
        
        String s1 = str.substring(str.length()-1)+str.substring(0,str.length()-1);
        
        //backward shift
        String s2 = str.substring(1,str.length())+str.charAt(0);
        
        if(s1.equalsIgnoreCase(s2))
            System.out.println(1);
        else
            System.out.println(0);
    }
}