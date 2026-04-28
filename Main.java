public class Main {

    public static void main (String[] args){

        Document d = new Document();
        Editor e1 = new Editor(d);
        Editor e2 = new Editor(d);
        Editor e3 = new Editor(d);
        Thread t1 = new Thread(e1);
        Thread t2 = new Thread(e2);
        Thread t3 = new Thread(e3);
        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        }
        catch (InterruptedException e){
            System.out.println("Thread was interrupted");
        }

        System.out.println(d.getWordCount());
    }
}
