public class MessagePrinter implements Runnable {
    // Runnable interface contains one method - the run() method

    @Override
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println("Hello from the thread!");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                System.out.println("Thread was interrupted!");
            }
            
        }
    }
}
