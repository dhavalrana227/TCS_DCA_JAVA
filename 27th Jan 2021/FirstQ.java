/*

Take a string as input and remove 7 and 56 from the string

input : A7rgh56a
output : Argha

input : M732756Abcdefghijk
output : M32Abcdefghijk
*/

import java.util.*;
public class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();

        str = str.replace("7","");
        str = str.replace("56","");
        
        System.out.println(str);
    }
}