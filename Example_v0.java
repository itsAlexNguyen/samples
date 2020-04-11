public class A {
    private static int X;
    private static int Y = 5;

    public A(){
        A.X = 5;
    }
    
    /** Javadoc for fcn **/
    public int fcn(){
        return A.X * A.Y;
    }
    
    public int test(){
        return A.X * A.Y;
    }
    
    public int test(){
        return 15 + 26;
    }
    
    public int test3(){
        return 999 - 25;
    }
    
    public int test4(){
        return 999 - 25;
    }
}
