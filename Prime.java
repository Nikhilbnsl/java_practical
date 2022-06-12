//checking a prime condtion
import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the number:");
        // example int num =9;
       int num = Sc.nextInt();
        boolean st =false;
        for (int i=2; i < num/2; ++i){
            if(num % i == 0){
                st = true;
                break;
            }
        }
        if(!st)
        System.out.println(num + "is prime.");
        else
        System.out.println(num + "is not prime.");
    }

}