import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class sd{
     public static void main(String aa[]){
    String a;
    int px;
     Scanner s=new Scanner(System.in);
     px=s.nextInt();
     a=String.valueOf(px);
     char b[]=a.toCharArray();
     for(int i=0;i<b.length;i++){
         System.out.printf("%c\t",b[i]);
     }
}
}

