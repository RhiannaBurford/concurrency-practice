public class Main {

    public static void main (String[] args){

        Sensor s = new Sensor();
        Thread t1 = new Thread(s);
        t1.start();

        while (t1.isAlive()){ // while thread is still running
            Thread.yield();
            System.out.println("Sensor is still running...");
        }
        System.out.println("Scan complete");
    }
}
