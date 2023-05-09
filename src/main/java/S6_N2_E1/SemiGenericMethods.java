package S6_N2_E1;

public class SemiGenericMethods <T>{

    public static <T> void semiGenericMethods (String level, T arg1, T arg2) {
        System.out.println("Els tres arguments son: "+level+", "+arg1+", "+arg2);
    }
}
