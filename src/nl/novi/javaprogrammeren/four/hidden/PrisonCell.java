package nl.novi.javaprogrammeren.four.hidden;

public class PrisonCell {
Inhabitant inhabitant;
String prisonerName;

    public PrisonCell(String prisonerName) {
        this.prisonerName = prisonerName;
    }

    public String getName() {
        return inhabitant.getName();
    }

    public Inhabitant getInhabitant() {
        return inhabitant;
    }

    public void setInhabitant(Inhabitant inhabitant) {
        this.inhabitant = inhabitant;
    }
}
