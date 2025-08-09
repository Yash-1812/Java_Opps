class MobilePhone{
    String brand;
    int price;
    int storage;
    
    void call(String contact_name){
        System.out.println("Calling "+contact_name+" ...");
    }
}
public class Main{
    public static void main(String args[]){
        MobilePhone phone1 = new MobilePhone();
        phone1.brand = "Lava";
        phone1.price = 10000;
        phone1.storage = 5;
        phone1.call("Yash");
    }
}