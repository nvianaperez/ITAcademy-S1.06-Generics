package S6_N3_E1;

public class Generic {

    public static <T extends Telephone> void genericMethodOne (T t) {
        t.call();
    }

    public static <T extends Smartphone> void genericMethodTwo (T t) {
        t.call();
        t.takePhotos();
    }
}
