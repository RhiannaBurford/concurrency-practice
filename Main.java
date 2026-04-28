public class Main {

    public static void main (String[] args){

        TimerTask t = new TimerTask();
        Thread t1 = new Thread(t);
        t1.start();
        System.out.println("Countdown started!");
    }
}
