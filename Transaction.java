public class Transaction implements Runnable{

    private BankAccount ba;

    public Transaction(BankAccount ba){
        this.ba = ba;
    }

    @Override
    public void run(){
        ba.deposit(100);
    }

}
