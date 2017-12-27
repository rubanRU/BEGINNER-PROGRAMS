import java.util.*;
import java.lang.*;
public class min1{
      public static void main(String aa[]){
       int n;
       int count=0;
       int c;
       ArrayList<Integer>a=new ArrayList<Integer>();
       Scanner s=new Scanner(System.in);
       n=s.nextInt();
       for(int i=0;i<n;i++){
           c=s.nextInt();
           a.add(c);
       }
       System.out.println(Collections.min(a));
       
      
}
}
