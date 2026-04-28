public class Sensor implements Runnable {

    @Override
    public void run(){
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            System.out.println("Sensor interrupted.");
        }
        
    }
}
