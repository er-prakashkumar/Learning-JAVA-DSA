// Take Cost and Selling Price as input. Print profit or loss or nothing. Also print in percentage.

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price = ");
        double cp = sc.nextDouble();
        System.out.print("Enter Selling Price = ");
        double sp = sc.nextDouble();
        if(sp==cp){
            System.out.println("No loss No Profit");
        }else if (sp>cp){
            double profit = sp - cp;
            double profit$ = profit / cp * 100;
            System.out.println("Profit of "+ profit + " which is " + profit$ + "%.");
        }else{
            double loss = sp - cp;
            double loss$ = loss / cp * 100;
            System.out.println("Loss of "+ loss + " which is " + loss$ + " %.");
        }
        sc.close();
    }
}
