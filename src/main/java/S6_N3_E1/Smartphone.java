package S6_N3_E1;

public class Smartphone implements Telephone {

    @Override
    public void call () {
        System.out.println("It's calling... from "+ this.getClass().getSimpleName());
    }

    public void takePhotos () {
        System.out.println("It's taking photos...");
    }


}
