package sample;

public class Counter {
    private static int value = 0;

    /**
     * Creates a counter instance
     * @return Counter instance
     */
    private Counter() {}

    /**
     * Increments the counter value
     * @return counter value
     */
    public static int increment(){
        return ++value;
    }

    public static void reset(){
        value = 0;
    }
}
