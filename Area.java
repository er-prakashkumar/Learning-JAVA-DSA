public class Area {
    public static void main(String[] args) {
        double z = 3; // radius of circle or sphere 
        double areaOfCircle = 3.14*z*z;
        double volumeOfSphere = 4/3*areaOfCircle*z;
        // Now let a, b and c are sides of a cubiod 
        double a, b, c ;
        a = 10;
        b =12;
        c= 15;
        double surfaceAreaOfCubiod = 2*(a*b+b*c+a*c);
        System.out.println("areaOfCircle  " + areaOfCircle);
        System.out.println("volumeOfSphere  " + volumeOfSphere);
        System.out.println("surfaceAreaOfCubiod  " + surfaceAreaOfCubiod);
        
    }
}
