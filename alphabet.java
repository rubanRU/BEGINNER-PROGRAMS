import java.util.*;
public class alphabet{
      public static void main(String aa[]){
            char n;
            Scanner s=new Scanner(System.in);
            n=s.next().charAt(0);
            if((n>='a'&&n<='z')||(n>='A'&&n<='Z')){
                System.out.println("Alphabet");
            }
         else{
                System.out.println("not alphabet");
         }

             
      }

}
