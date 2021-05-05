package justcode.test1;

import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CheckReturn checkReturn = new Check();
        System.out.println("checkReturn = " + checkReturn);
        System.out.println("checkReturn.getAttributes() = " + checkReturn.getAttributes().get("response"));
        System.out.println("(Map)checkReturn.getAttributes() = " + ((Map)checkReturn.getAttributes()).get("response"));
    }
}
