import java.util.*;
import java.lang.*;
public class palindrome{
      public static void main(String aa[]){
           int n;
           Scanner s=new Scanner(System.in);
           n=s.nextInt();
           String h=String.valueOf(n);
          StringBuffer g=new StringBuffer(h);
        String l=g.reverse().toString();
        if(h.equals(l)){
            System.out.println("Palindrome");
        }
       else {
            System.out.println("Not palindrome");
       }
           
         

    }
}
