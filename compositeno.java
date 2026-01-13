public class compositeno {
    public static void main(String[] args) {
        int n = 7;
        boolean isComposite = false;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                isComposite = true;
                break;
            }
        }
        if(isComposite){
            System.out.println("Composite");
        }else{
            System.out.println("Not Composite");
        }
    }
}
