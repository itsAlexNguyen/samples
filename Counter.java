package samples;

public class Counter {
    public int value;

    public Counter() {
        this.value = 4;
        log.log("Counter created");
    }

    public int reset(){
        return this.value = 0;
    }
    
    public int increment(){
        return ++this.value;
    }
    
    public double secretVal(){
        return 4.56;
    }
}
