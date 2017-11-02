package dk.hungarian.skabninger;

import dk.hungarian.Gender;
import dk.hungarian.Genstand;
import dk.hungarian.Skabning;

public class Varulv extends Skabning {


    public Varulv(String navn, String beskrivelse, int styrke, Gender gender) {
        super(navn, beskrivelse, styrke, gender);
    }
    public Varulv(){
        super("Varulv "," som er så vred på alle den møder ", 80 , Gender.UKØNNET);

    }


    @Override
    public String toString() {
        return this.getNavn() + this.getBeskrivelse() + this.getStyrke() +" " + getGender();
    }
    public String look() {
        return toString();
    }
}
