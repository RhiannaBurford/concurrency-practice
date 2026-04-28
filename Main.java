public class Main {

    public static void main (String[] args){

        Worker2 w = new Worker2();
        Thread t1 = new Thread(w);
        t1.start();
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            System.out.println("Error in thread.");
        }
        t1.interrupt();
        try {
            t1.join();
        }
        catch (InterruptedException e){
            System.out.println("Error in thread.");
        }
        
        System.out.println("Main program finished");
    }
}
