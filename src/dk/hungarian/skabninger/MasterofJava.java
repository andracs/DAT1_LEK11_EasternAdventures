package dk.hungarian.skabninger;

import dk.hungarian.Gender;
import dk.hungarian.Skabning;
import dk.hungarian.interfaces.Lookable;

//Lavet af Michael (SaneStreet)
public class MasterofJava extends Skabning {

    int coffeeLevel;
    public MasterofJava(String navn, String beskrivelse, int styrke, Gender gender, int coffeeLevel) {
        super(navn, beskrivelse, styrke, gender);
        this.coffeeLevel = coffeeLevel;
    }

    public MasterofJava(){
        super("Java Mesteren", "Han laver bare kaffe..", 1, Gender.UKØNNET);
        this.coffeeLevel = 100;
    }

    public String look() {
        return "Du kigger på Mesteren af Java! Han ser meget vred og varm ud.";
    }

    @Override
    public String toString() {
        return "MasterofJava{" +
                "coffeeLevel=" + coffeeLevel +
                "} " + super.toString();
    }
}
