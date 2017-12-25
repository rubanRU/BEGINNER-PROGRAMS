import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class maxminn{
     public static void main(String aa[]){
     int a,f;
     ArrayList<Integer>b=new ArrayList<Integer>();
     Scanner s=new Scanner(System.in);
     a=s.nextInt();
     for(int i=0;i<a;i++){
         f=s.nextInt();
         b.add(f);
     }
     Integer min=Collections.min(b);
     Integer max=Collections.max(b);
     System.out.printf("%d %d", min,max);

     

    }
}
