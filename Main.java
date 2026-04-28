public class Main {

    public static void main (String[] args){

        Inventory i = new Inventory();
        DeliveryTruck d1 = new DeliveryTruck(i);
        Thread thread1 = new Thread(d1);
        Thread thread2 = new Thread(d1);
        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e){
            System.out.println("Error with interrupt");
        }

        System.out.println("Final num items: " + i.getItemsInStock());
    
    }
}
