public class Main {

    public static void main (String[] args){
        BankAccount ba = new BankAccount();
        Transaction tr = new Transaction(ba);
        Thread t1 = new Thread(tr);
        Thread t2 = new Thread(tr);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){
            System.out.println("error in thread.");
        }
        

        System.out.println(ba.getBalance());
    }
}
