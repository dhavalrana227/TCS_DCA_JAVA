/*

Mix even and odd series and find the number of position of x

input: 10 (position)
output: 7

input: 20 (position)
output: 17
*/
import java.util.*;
public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        
        odd.add(0);
        for(int i=0;i<50;i+=2){
            even.add(i);
        }
        
        for(int i=1;i<50;i+=2){
            odd.add(i);
        }
        
        for(int i=0;i<num;i++){
            res.add(even.get(i));
            res.add(odd.get(i));
        }
        
        //System.out.println(res);
        System.out.println(res.get(num-1));
    }
}