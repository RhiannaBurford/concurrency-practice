public class Worker2 implements Runnable{



    @Override
    public void run(){
        while(true){
            System.out.println("Worker is processing...");
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                System.out.println("Worker stopping safely");
                break;
            }
        }
    }

}
