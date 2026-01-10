// Take n as input from user and print the following sequence
// 1, n, 2, n-1, 3, n-2,...........
// for n=5 :: 1, 5, 2, 4, 3, 3, 4, 2, 5, 1,
public class series2 {
    public static void main(String[] args) {
        int n = 5;
        String res = "";
        for (int i=1; i<=n; i++ ){
            int b = n -i +1;
            res = res + i + ", " + b + ", ";
        }
        System.out.println("Series : " + res);
    }
}
