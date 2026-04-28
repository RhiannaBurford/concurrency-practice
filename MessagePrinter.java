public class MessagePrinter implements Runnable {


    @Override
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println("Hello from the thread!");
        }
    }
}
