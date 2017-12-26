import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class palin{
     public static void main(String aa[]){
         String a;
    Scanner s=new Scanner(System.in);
    a=s.next();
    String w=new StringBuffer().reverse().toString();
    if(a.equalsIgnoreCase(w)){
        System.out.println("Palindrome");
    }
 else{
        System.out.println("Not palindrome");
 }

}
    }
