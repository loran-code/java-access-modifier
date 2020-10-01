package nl.novi.javaprogrammeren.three.sub;

public class Human {
    private static String sofiNumber;

    public Human(String sofiNumber) {
        this.sofiNumber = sofiNumber;
    }

    public static String getSofiNumber() {
        return sofiNumber;
    }

    public void setSofiNumber(String sofiNumber) {
        this.sofiNumber = sofiNumber;
    }
}
