public class B {
    private static int first;
    private static int second = 5;
    private static int third = 52;

    public B(){
        B.first = 45;
    }
    
    public int subtract(){
        return B.first - B.second;
    }
    
    public int mult(){
        return B.first * B.second;
    }
}
