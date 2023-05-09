package S6_N2_E1;

import S6_N1_E2.GenericMethods;
import S6_N1_E2.Person;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Nuria", "Viana", 45);
        SemiGenericMethods.semiGenericMethods("entry", p1,10);

//        SemiGenericMethods.semiGenericMethods(p1, "entry", 30); // Error: first argument requires a String

    }
}
