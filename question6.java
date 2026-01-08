// Check Divisible by 5 , 3 , (5 and 3).

import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int x = ss.nextInt();
        if(x%5==0 && x%3==0){
            System.out.println(x + " is divisible by 5 and 3.");
        } else if (x%5==0){
            System.out.println(x + " is divisible by 5.");
        } else if (x%3==0){
            System.out.println(x + " is divisible by 3.");
        } else {
            System.out.println(x + " is not divisible by 5 or 3.");
        }
        ss.close();
    }
}
