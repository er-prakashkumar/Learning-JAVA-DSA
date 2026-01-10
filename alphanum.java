// Print all alphabets with their corresponding ASCII values.
public class alphanum {
    public static void main(String[] args) {
        String res = "";
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            int ascii = (int) ch;
            res = res + "(" + ch + " : " + ascii + "), ";
        }
        System.out.println("Alphabets with ASCII values: " + res);
    }
}
