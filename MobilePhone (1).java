class MobilePhone{
    private String brand;
    private double price;
    
    MobilePhone(String brand_ , double price_){
        brand = brand_;
        price = price_;
    }
    
    public String get_brand(){
        return brand;
    }
    
    public double get_price(){
        return price;
    }
    
    public void set_price(double increment){
        if(increment < 0){
            System.out.println("Invalid input");
        }
        else{
            price = price + increment;
        }
    }
}




