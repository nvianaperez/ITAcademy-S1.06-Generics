package S6_N1_E1;

public class Main {
    public static void main(String[] args) {
        String firstLang = "Castellà";
        String secondLang = "Català";
        String thirdLang = "Anglès";

        NoGenericMethods m1 = new NoGenericMethods(firstLang, secondLang, thirdLang);
        NoGenericMethods m2 = new NoGenericMethods(thirdLang, firstLang, secondLang);

        System.out.println("El primer objecte és "+m1);
        System.out.println("El segon objecte és " + m2);
    }


}
