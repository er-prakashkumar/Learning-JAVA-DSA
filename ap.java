// Display AP series : 2, 5, 8, 11, 14, ..... up to n terms 
/* In mathematics, If a is first term and d is common difference then formula for i^th term is: -
   i^th term = a + ( i -1)d 
 */
public class ap {
    public static void main(String[] args) {
        int n = 7;
        int a = 2; // starting term ---> first term
        int d = 3; // common difference
        String res = "";
        for(int i = 1; i<=n; i++){
            int b;
            b = a + (i-1)*d; // for i^th term
            res = res + b + ", ";
        }
        System.out.println("AP : "+ res );
    }
}
