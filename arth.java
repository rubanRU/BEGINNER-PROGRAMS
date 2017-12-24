import java.util.*;
import java.lang.*;
public class arth{
      public static void main(String aa[]){
      int n;
      int f;
      int l;
      int sum=0;
      int val;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      f=s.nextInt();
      l=s.nextInt();
      val=f;
      for(int i=0;i<n;i++){
          sum=sum+val;
          val=val+l;
      }
   System.out.println(sum);

      
}
}
