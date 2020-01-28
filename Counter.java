package samples;

import sl4j.logger.log;

public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
        log.log("Counter created");
    }

    public int increment(){
        return ++this.value;
    }

    public int reset(){
        return this.value = 0;
    }
}
