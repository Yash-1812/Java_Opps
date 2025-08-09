public class Main{
    public static void main(String args[]){
        Flyable f1 = new Bird();
        f1.fly();
        Flyable f2 = new AeroPlane();
        f2.fly();
    }
}