package S6_N2_E2;

import java.util.List;

public class ListGenericMethods {

    public static <T> void listGenericMethods (T... args) {
        System.out.println("Numbers of arguments: "+args.length);
        for (T arg : args) {
            System.out.println("\t" + arg);
        }
    }
}
