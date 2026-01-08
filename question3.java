// Take integer input and print the absolute value of that number.
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer = ");
        int a = sc.nextInt();
        if (a < 0) {
            a = -a;
        }
        System.out.println("The absolute value of " + a + " is = " + a);
        sc.close();
    }
}
