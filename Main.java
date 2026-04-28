public class Main {

    public static void main (String[] args){
        MessagePrinter mp = new MessagePrinter(); // Create instance
        Thread thread = new Thread(mp);           // Create thread
        thread.start();                           // Start the thread
        for (int i = 0; i < 5; i++){
            System.out.println("Hello from MAIN");
        }
    }
}
