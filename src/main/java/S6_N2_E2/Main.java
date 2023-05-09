package S6_N2_E2;

import S6_N1_E2.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static <T> void main(String[] args) {
        Person p2 = new Person("Gabriela", "Santana", 75);
        Person p3 = new Person("Luis", "Fontseca", 25);

        List<T> listArgs = new ArrayList<T>();
        listArgs.add((T) "Java");
        listArgs.add((T) p2);
        listArgs.add((T)(Integer)50);
        listArgs.add((T)(Double)40.25);
        listArgs.add((T)p3);
        ListGenericMethods.listGenericMethods(listArgs, "More Arguments", 50.20, 60, "a");
    }
}
