import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class charnum{
     public static void main(String aa[]){
     int n;
     int sum=0;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     String f=String.valueOf(n);
     char a[]=f.toCharArray();
     for(int i=0;i<a.length;i++){
        int d=Character.getNumericValue(a[i]);
        sum=sum+d;
     }
     System.out.print(sum);

}
}

