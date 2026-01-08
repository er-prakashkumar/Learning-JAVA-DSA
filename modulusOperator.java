public class modulusOperator {
    public static void main(String[] args) {
        int a, b, c, d, m1, m2, m3, m4 ;
        a = 29;
        b = 5;
        c = -a; // -29
        d = -b; // -5
        m1 = a % b; 
        m2 = a % d; // = a % (-b) =  a % b
        m3 = c % b; // = -a % b   = -(a%b)
        m4 = c % d; // = -a % -b  = -(a%b)
        System.out.println(m1 +" "+ m2 +" "+ m3+ " "+ m4);
    }
}
