// Divisible by 5 or not.

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer = ");
        int a = sc.nextInt();
        System.out.print(a + " " + (a%5==0 ? "is divisible by 5" : "is not divisible by 5"));
        sc.close();
         }
}
