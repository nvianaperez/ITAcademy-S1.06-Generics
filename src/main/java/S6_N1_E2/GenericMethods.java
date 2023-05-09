package S6_N1_E2;

public class GenericMethods <T> {

    public static <T> void genericMethod(T arg1, T arg2, T arg3) {
        System.out.println("Els tres arguments genèrics son: "+arg1+", "+arg2+", "+arg3);
    }
}
