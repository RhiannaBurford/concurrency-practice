public class BankAccount {

    private int balance;

    public int getBalance(){
        return balance;
    }

    public synchronized void deposit(int amount){
        balance = balance + amount;
    }

}
