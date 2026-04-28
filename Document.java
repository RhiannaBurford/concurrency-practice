public class Document {

    private int wordCount = 0;

    public int getWordCount(){
        return wordCount;
    }

    public synchronized void addWords(int count){
        wordCount += count;
    }
}
