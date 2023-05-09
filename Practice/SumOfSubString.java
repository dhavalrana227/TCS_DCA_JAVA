/*
Sum of possible sequence substring of given string
input : 1234
output : 1+2+3+4+12+23+34+123+234+1234
*/

import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                
                String temp = s.substring(i,j);
                sum += Integer.parseInt(temp);
            }
        }
        
        System.out.println(sum);
    }
}