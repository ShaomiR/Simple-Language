
package test;
import java.util.*;
public class SimpleLanguage {
    
    
    public static void main(String[] args) {
        int n = 3;
        int x=0;
        int max = 0;
        Scanner sc = new Scanner(System.in);
        for(int i= 0; i<n;i++ ){
            String in = sc.nextLine();
            String [] input = in.split("\\s+");
            System.out.println("Command , value");
            System.out.println(input[0]+ "      "+input[1]);
            if("add".equals(input[0].toLowerCase())){
                System.out.println("add Operation");
                System.out.println("Before x was : "+x);
                x += Integer.parseInt(input[1]);
                System.out.println("After add x is : "+x);
                System.out.println("checking for max");
                if(max < x){
                     System.out.println("max will change now");
                     System.out.println("Before max was : "+max);
                    max = x;
                     System.out.println("Now max is : "+max);
                }
            }
            else if("set".equals(input[0].toLowerCase())){
                System.out.println("set Operation..................");
                System.out.println("Before x was : "+x);
                x = Integer.parseInt(input[1]);
                System.out.println("After set x is : "+x);
                System.out.println("checking for max");
                if(max < x){
                     System.out.println("max will change now");
                     System.out.println("Before max was : "+max);
                    max = x;
                     System.out.println("Now max is : "+max);
                }
            }
        }
        System.out.println(max);
    }
    
}
