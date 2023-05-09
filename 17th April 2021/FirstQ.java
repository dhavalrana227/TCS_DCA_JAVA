/*
input   : 0 1 2 3 4 5 6 7 8 9
output  : 9 8 7 6 5 4 3 2 1 0
*/

import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        if(num > 1000000 || num <= 0)
            System.out.println("Wrong Input");
        else{
            String s = Integer.toString(num);
            
            for(int i=0;i<s.length();i++){
                
                int x = s.charAt(i)-'0';
                x = 9-x;
                System.out.print(x);
            }
        }
    }
}