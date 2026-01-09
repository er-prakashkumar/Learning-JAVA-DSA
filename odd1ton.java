// Write a program to print all odd numbers from 1 to n.
public class odd1ton {
    public static void main(String[] args) {
        int n = 100;
       for(int i=1; i<=n; i++){
        if(i%2!=0){
            System.out.println(i);
        }
       }
    }
}
