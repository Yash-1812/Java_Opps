class Person{
    String name;
    
    Person(String name){
        this.name = name;
    }
}
class Employee extends Person{
    int salary;
    Employee(int salary , String name){
        super(name);
        this.salary = salary;
    }
    void display(){
        System.out.println("Employee name : "+super.name);
        System.out.println("Employee salary : "+this.salary);
    }
}