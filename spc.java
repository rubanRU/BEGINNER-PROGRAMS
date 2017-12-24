import java.util.*;
import java.lang.*;
public class spc {
     public static void main(String aa[]){
      String a;
      int count=0;
      Scanner s=new Scanner(System.in);
      a=s.nextLine();
    
     for(int i=0;i<a.length();i++){
        if(a.charAt(i)==' '){
            count++;
        }
     }
     System.out.println(count);
    }

      
}
