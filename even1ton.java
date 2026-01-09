// Write a Java program to print all even numbers from 1 to n using a loop.

public class even1ton {
    public static void main(String[] args) {
        int n = 100;
       for(int i=1; i<=n; i++){
        if(i%2==0){
            System.out.println(i);
        }
       }   
    }
}
