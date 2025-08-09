class Animal{
    void sound(){
        System.out.println("Some Generic animal sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meow");
    }
}