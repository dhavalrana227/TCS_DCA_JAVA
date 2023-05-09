/*

check length of string is equals to the number appended at its last

input: Techn5
output: Yes

input: TechnoName 15
output: No

*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        String temp="";
        String str2="";
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                temp+=str.charAt(i);
            }
            else
                str2+=str.charAt(i);
        }
        
        int num = Integer.parseInt(temp);
        
        if(num == str2.length()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}