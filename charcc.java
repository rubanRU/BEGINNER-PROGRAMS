import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class charcc {
    public static void main(String aa[]){
    String a;
    int d;
    Scanner s=new Scanner(System.in);
    a=s.next();
    d=s.nextInt();
    String h=new StringBuffer(a).reverse().toString();
    char f[]=h.toCharArray();
    d=d-1;
    for(int i=0;i<f.length;i++){
           if(i==d){
               System.out.println(f[i]);
           }
    }
   
           
   }
}

