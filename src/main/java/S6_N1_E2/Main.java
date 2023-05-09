package S6_N1_E2;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Anna", "Rodríguez", 45);
        GenericMethods.genericMethod(person1, "europea", 10);
        GenericMethods.genericMethod("asiàtica", 20, person1);
    }
}
