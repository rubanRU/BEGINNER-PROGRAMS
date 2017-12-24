import java.util.*;
import java.lang.*;
public class spec{
     public static void main(String aa[]){
      String a;
      int count=0;
      Scanner s=new Scanner(System.in);
      a=s.nextLine();
     for(int i=0;i<a.length();i++){
        if(a.charAt(i)>='0'&&a.charAt(i)<='9'){
             count++;
        }
     }
     System.out.println(count);
    }

      
}
