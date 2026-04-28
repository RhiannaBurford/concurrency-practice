public class Inventory {

    private int itemsInStock = 50;

    public int getItemsInStock(){
        return itemsInStock;
    }

    public synchronized void pickUp(int count){
        itemsInStock = itemsInStock - count;
    }

}
