
package lab_3.pkg2;
import java.util.Scanner;
/**
 *
 * @author sameeh boshra
 */
public class Lab_32 {

  
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        Lion l = new Lion();
        String eat=input.next();
     
        l.setEat(eat);
        l.print();
        
    }
    
}
