import java.util.*;
import java.lang.*;
public class pow{
      public static void main(String aa[]){
            double n;
            double p;
            double pow=1;
            Scanner s=new Scanner(System.in);
            n=s.nextDouble();
            p=s.nextDouble();
            for(double i=1;i<=n;i++){
                 pow=Math.pow(p, i);
            }
            System.out.println(pow);

         

    }
}
