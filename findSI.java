public class findSI {
    public static void main(String[] args) {
        double r, p ,t ; // r -> rate of interest, p -> principal, t -. time
        r= 10 ; // percent
        t = 5; // year
        p = 15000; // Rupees
        double si = (p*r*t)/100 ; // Rupees 
        System.out.println("Simple interest = "+si);
        double amount = p + si;
        System.out.println("Total Amount = "+ amount);
        }
}
