public class Main{
    public static void main(String args[]){
        MobilePhone phone1 = new MobilePhone();
        MobilePhone phone2 = new MobilePhone("Lava" , 10000 , 5);
        phone1.display_info();
        phone2.display_info();
    }
}