// Take +ve integer input and tell if it is Odd or Even.

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter +ve Integer = ");
        int a = sc.nextInt();
        if (a<=0){
            System.out.println(a + " is not a positive integer.");
        }else{
            if(a%2==0){
                System.out.println(a+ " is even number.");
            }else{
                System.out.println(a+" is odd number.");
            }
        }
        sc.close();
    }
}
