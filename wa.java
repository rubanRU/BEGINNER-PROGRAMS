import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class wa{
     public static void main(String aa[]){
       Scanner s=new Scanner(System.in);
       int a[]=new int[3];
       int b[]=new int[3];
       int c[]=new int[3];
       for(int i=0;i<a.length;i++){
           a[i]=s.nextInt();
           b[i]=s.nextInt();
       }
       for(int i=0;i<a.length;i++){
           c[i]=b[i]-a[i];
           System.out.println(c[i]);
       }
}
    }
