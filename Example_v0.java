package controller;

import java.util.Random;

public class A {
    private static int val;

    public A() {
        A.val = 5;
    }

    public int fcn(){
        return A.val * 5;
    }

    protected int test(){
        return A.val * 5;
    }
}
