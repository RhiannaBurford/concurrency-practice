public class SharedBuffer {

    private boolean hasData;
    private int data;

    public synchronized int get(){
        while(!hasData){
            try {
                wait();
            }
            catch (InterruptedException e){
                System.out.println("Error in thread.");
            }
        }
        int temp = data;
        hasData = false; // Buffer is now empty

        notifyAll();    // Wake up the Producer
        return temp;
    }

    public synchronized void put(int value) {
        // If hasData is true, we have to wait because the buffer is full!
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        // Now that we've stopped waiting...
        // 1. How would you update 'hasData' here?
        data = value;
        hasData = true;
        // 2. What method should you call to wake up the Consumer?
        notifyAll(); // use notifyAll() instead of notify() here
    }

}
