/*
 
Remove duplicates from given String
input: 3
       (42y,2ya,ya6)

output: 42ya6

*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        String str = sc.nextLine();
        
        str = str.substring(1,str.length()-1);
        
        String[] temp = str.split(",");
        
        List<Character> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<temp[i].length();j++){
                list.add(temp[i].charAt(j));
            }
        }
        
        List<Character> list2 = new ArrayList<>();
        
        for(int i=0;i<list.size();i++){
            
            if(!list2.contains(list.get(i)))
                list2.add(list.get(i));
        }
        
        String ans="";
        for(int i=0;i<list2.size();i++){
            ans+=list2.get(i);
        }
        
        System.out.println(ans);
    }
}
