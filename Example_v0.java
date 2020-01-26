package sample;

public class A {
    private int X;

    public A() {
        this.X = 5;
    }

    public int fcn(){
        return this.X * 5;
    }

    public int test(){
        return this.X * 5;
    }

    @Override
    public String toString(){
        return "A";
    }
}
