public class Editor implements Runnable{

    private Document d;

    public Editor(Document d){
        this.d = d;
    }

    @Override 
    public void run(){
        for (int i = 0; i < 1000; i++){
            d.addWords(1);
        }
    }
}
