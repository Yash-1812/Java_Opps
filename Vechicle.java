abstract class Vechicle{
    abstract void start();
    void stop(){
        System.out.println("Stop the car");
    }
}
interface Honk{
    void honk();
}
class Car extends Vechicle implements Honk{
    @Override
    void start(){
        System.out.println("Start the car");
    }
    @Override
    public void honk(){
        System.out.println("Car is honking");
    }
}
class Bike extends Vechicle{
    @Override
    void start(){
        System.out.println("Start the bike");
    }
}