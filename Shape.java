abstract class Shape{
    abstract void draw();
    void info(){
        System.out.println("This is a shape");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a circle");
    }
}
class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a rectangle");
    }
}