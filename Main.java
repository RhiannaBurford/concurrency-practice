public class Main {

    public static void main (String[] args){
        MessagePrinter mp = new MessagePrinter(); // Create instance
        Thread thread = new Thread(mp);           // Create thread
        thread.start();                           // Start the thread
        try{
            thread.join();
        }
        catch (InterruptedException e){
            System.out.println("Error with thread.");
        }
        
        System.out.println("The background thread is finally done! Now MAIN can finish.");
    }
}
