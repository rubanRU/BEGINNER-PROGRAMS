import java.util.*;
import java.lang.*;
public class maxx{
     public static void main(String aa[]){
     int n;
     int c;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     ArrayList<Integer>a=new ArrayList<Integer>();
     for(int i=0;i<n;i++){
        c=s.nextInt();
        a.add(c);
     }
   System.out.print(Collections.max(a));
    }
}
