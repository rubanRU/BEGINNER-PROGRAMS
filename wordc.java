mport java.util.*;
import java.lang.*;
public class wordc{
     public static void main(String aa[]){
      String a;
      int count=0;
      Scanner s=new Scanner(System.in);
      a=s.nextLine();
     String d[]=a.split("\\s+");
     for(int i=0;i<d.length;i++){
         count++;
     }
     System.out.println(count);
    }

      
}
