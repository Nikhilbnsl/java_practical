import java.util.Scanner;
public class SumofInt{
    public static void main(String[] args){
        System.out.println("enter any 5 integers:");
        int n = 0;
        int i = 0;
        while(i<5){
            Scanner Sc = new Scanner(System.in);
            int num = Sc.nextInt();
             n= num + n;
            i++;
        }
        System.out.println(n);
    }
}
