class BankAccount{
    private double balance;
    
    BankAccount(double initialbalance){
        balance = initialbalance;
    }
    public double getbalance(){
        return balance;
    }
    public void deposit(double amt){
        if(amt > 0){
            balance = balance + amt;
        }
        else{
            System.out.println("Invalid deposit");
        }
    }
}