// Display GP : 1, 2, 4, 8,.....upto n terms 
/* In mathematics, If a is first term and r is common ratio then formula for i^th term is: -
   i^th term = a*r^n-1 
 */
public class gp {
    public static void main(String[] args) {
        int a = 1; // first term
        int r = 2; // common ratio
        int n = 5; // upto term
        String res = "";
        for (int i = 1; i<=5; i++){
            res = res + a + ", ";
            a*=r;
        }
        System.out.println("GP : "+ res);
    }
}
