public class Counter {

    private int count;

    public synchronized void increment(){
        count++;
    }

}
