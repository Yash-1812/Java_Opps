interface Flyable{
    void fly();
}
class Bird implements Flyable{
    @Override
    public void fly(){
        System.out.println("Bird is flying");
    }
}
class AeroPlane implements Flyable{
    @Override
    public void fly(){
        System.out.println("Aeroplane is flying");
    }
}