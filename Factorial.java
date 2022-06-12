
/* 
         factorial of a given number
    
*/
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        int i, Factorial = 1;
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.close();
        for (i = 1; i <= a; i++) {
            Factorial = Factorial * i;
        }
        System.out.println("The factorial of the number is : " + Factorial);
    }
}
