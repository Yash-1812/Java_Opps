class MobilePhone{
    String brand;
    int price;
    int storage;
    
    MobilePhone(){
        brand = "unknown";
        price = 0;
        storage = 0;
    }
    MobilePhone(String brand , int price , int storage){
        this.brand = brand;
        this.price = price;
        this.storage = storage;
    }
    void display_info(){
        System.out.println("Brand : "+this.brand+"\n"+"Price : "+this.price+"\n"+"Storage : "+this.storage);
    }
}