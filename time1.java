import java.util.*;
import java.lang.*;
public class time1{
     public static void main(String aa[]){
        int h1;
        int h2;
        int m1;
        int m2;
        int dif,dif1,dif2;
        Scanner s=new Scanner(System.in);
        h1=s.nextInt();
        h2=s.nextInt();
        m1=s.nextInt();
        m2=s.nextInt();
        h1=h1*60+m1;
        h2=h2*60+m2;
        dif2=h2-h1;
        if(dif2>60){
            h1=dif2/60;
            h2=dif2%60;
            System.out.printf("%d %d",Math.abs(h1),Math.abs(h2));

        }
       else{
            System.out.println(Math.abs(dif2));
       }


      
}
}
