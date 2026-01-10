// Print the series : 99, 95, 91, 87,.......upto all terms which are positive.
/* a = 99 first term
   d = 4 common difference 
   every time it follow a = a-d untill >=1.
 */
public class series1 {
    public static void main(String[] args) {
        int a;
        int d = 4;
        String res = "";
        for (a=99; a>=1; a-=d ){
           res = res + a + ", ";
        }
        System.out.println("Series : " + res);
    }
}
