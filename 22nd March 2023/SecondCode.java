/* 

input : aaaaabbc    
        1
                a=5 b=2 c=1
                5-2=3
                3-1=2(output)
output : 2

count the occurance of Character and difference of
first two Character */

import java.util.*;
public class SecondCode{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        int n = sc.nextInt();
        
        int[] count = new int[256];
        
        for(int i=0;i<str.length();i++){
            count[(int)str.charAt(i)]++;
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<256;i++){
            if(count[i]!=0){
                list.add(count[i]);
            }
        }
        System.out.println(list.get(0)-list.get(1)-n);
        //System.out.println(ans);
        
        
    }
}