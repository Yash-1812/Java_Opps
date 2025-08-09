interface Drivable{
    void drive();
}

interface Chargeable{
    void charge();
}

class ElectricCar implements Drivable , Chargeable{
    @Override
    public void drive(){
        System.out.println("Car is drivable");
    }
    @Override
    public void charge(){
        System.out.println("Car is chargeable");
    }
}