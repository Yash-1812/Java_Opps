class Car{
    String colour;
    int speed;
    int price;
    
    
    Car(String colour , int speed , int price){
        this.colour = colour;
        this.speed = speed;
        this.price = price;
    }
    
    void display(){
        System.out.println("The speed of the car is "+this.speed);
        System.out.println("The colour of the car is "+ this.colour);
    }
}