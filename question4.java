// Take real number input and check it is an integer or not.

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a real number = ");
    double n = s.nextDouble();
    int x = (int)n;
    String res = (n-x==0) ? " is an Integer" : " is not an Integer";
    System.out.println(n + res);
    s.close();
    }
}
