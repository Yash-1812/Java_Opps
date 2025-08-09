public class Main{
    public static void main(String args[]){
        MobilePhone phone1 = new MobilePhone("Lava" , 1000);
        System.out.println("Brand is "+phone1.get_brand()+"\n"+"Price is "+phone1.get_price());
        phone1.set_price(500);
        System.out.println("New Price = "+phone1.get_price());
    }
}