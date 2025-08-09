class Car{
    String colour;
    int speed;
    int price;
    
    void display(){
        System.out.println("The speed of the car is "+speed);
        System.out.println("The colour of the car is "+ colour);
    }
    
}
public class Main{
    public static void main(String args[]){
        Car Toyota = new Car();
        Toyota.colour = "Blue";
        Toyota.speed = 120;
        Toyota.price = 10000;
        Toyota.display();
        Car Mahindra = new Car();
        Mahindra.colour = "Black";
        Mahindra.speed = 150;
        Mahindra.price = 15000;
        Mahindra.display();
    }
}