package sample;

public class A {
    private static int Z;

    public A() {
        A.Z = 5;
    }

    public int fcn(){
        return A.Z * 5;
    }

    public int test(){
        return A.Z * 5;
    }
}
