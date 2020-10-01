package nl.novi.javaprogrammeren.four;

import nl.novi.javaprogrammeren.four.hidden.PrisonCell;

public class MainFour {
    public static void main(String[] args) {

        PrisonCell inhabitant = new PrisonCell("Test");
        System.out.println(inhabitant.getName());
    }
}
