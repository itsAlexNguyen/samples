import java.util.ArrayList;

public class C {
    private static int first;
    private static int second = 5;
    private static int third = 52;

    public C(){
        C.first = 45;
    }
    
    public int subtract(){
        return C.first - C.second;
    }
    
    public int multiply(){
        return C.first * C.second;
    }
}
