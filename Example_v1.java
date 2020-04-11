import java.util.ArrayList;
import java.io.*;
import java.awt.*;

public class C {
    private static int firstVal;
    private static int second = 5;
    private static int third = 52;

    public C(){
        C.firstVal = 45;
    }
    
    public int subtract(){
        return C.firstVal - C.second;
    }
    
    public int multiply(){
        return C.firstVal * C.second;
    }
}
