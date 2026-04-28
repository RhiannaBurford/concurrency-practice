public class DeliveryTruck implements Runnable {

    private Inventory inv;

    public DeliveryTruck(Inventory inv){
        this.inv = inv;
    }

    @Override 
    public void run(){
        for (int i = 0; i < 3; i++){
            inv.pickUp(10);
        }
    }

}
