package S6_N1_E1;

public class NoGenericMethods {
    private String firstLang;
    private String secondLang;
    private String thirdLang;

    public NoGenericMethods(String firstLang, String secondLang, String thirdLang) {
        this.firstLang = firstLang;
        this.secondLang = secondLang;
        this.thirdLang = thirdLang;
    }

    public String getFirstLang() {
        return firstLang;
    }

    public void setFirstLang(String firstLang) {
        this.firstLang = firstLang;
    }

    public String getSecondLang() {
        return secondLang;
    }

    public void setSecondLang(String secondLang) {
        this.secondLang = secondLang;
    }

    public String getThirdLang() {
        return thirdLang;
    }

    public void setThirdLang(String thirdLang) {
        this.thirdLang = thirdLang;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "firstLang='" + firstLang + '\'' +
                ", secondLang='" + secondLang + '\'' +
                ", thirdLang='" + thirdLang + '\'' +
                '}';
    }
}
