public class Worker implements Runnable{

    private volatile boolean active = true;

    public void stopWorker(){
        active = false;
    }

    @Override
    public void run(){
        while(active){
            System.out.println("Worker is working...");
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                System.out.println("Error with thread.");
            }
            
        }
    }

}
