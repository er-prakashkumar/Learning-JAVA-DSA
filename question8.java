// Take +ve integer input and tell if it is a four digit number or not.

import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter a positive Integer = ");
        int n = ss.nextInt();
        if (n>999 && n<=9999) {
            System.out.println(n + " is a four digit number.");
        } else {
            System.out.println(n + " is not a four digit number.");
        }
        ss.close();
    }
}
