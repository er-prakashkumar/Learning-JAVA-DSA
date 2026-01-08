// Take integer input and tell if its magnitude is smaller than 69 or not without using any inbuilt methods.

import java.util.Scanner;

public class question7 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an Integer = ");
    int num = sc.nextInt();
      if (num < 69 && num > -69) {
         System.out.println("The magnitude of "+ num + " is smaller than 69");
      } else {
         System.out.println("The magnitude of "+ num + " is not smaller than 69");
      }
      sc.close();
   } 
}
/*  Another way to do this question is first we can convert the number to positive if it is negative
by multiplying it with -1 and then we can check if it is smaller than 69 or not. */