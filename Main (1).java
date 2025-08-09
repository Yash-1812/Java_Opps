public class Main{
    public static void main(String args[]){
        BankAccount acc1 = new BankAccount(1000);
        System.out.println("Initial balance = "+acc1.getbalance());
        acc1.deposit(500);
        System.out.println("Balance = "+acc1.getbalance());
    }
}