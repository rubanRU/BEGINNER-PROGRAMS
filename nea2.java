import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class nea2{
     public static void main(String aa[]){
     double a;
     double p;
     double c=0;
     Scanner s=new Scanner(System.in);
     a=s.nextDouble();
    for(double i=1;i<=a;i++){
      p=Math.pow(2, i);
      if(p>a){
          c=i;
          break;
      }
    }
     double f=Math.pow(2, c);
     System.out.println(f);


}
    }
