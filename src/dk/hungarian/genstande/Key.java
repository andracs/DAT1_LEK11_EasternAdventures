package dk.hungarian.genstande;

import dk.hungarian.Genstand;

public class Key extends Genstand {

    public Key(String navn, String beskrivelse, int styrke) {
       super(navn, beskrivelse, styrke);
    }
    public Key(){
        super("Nøgle ", "til at åben alle dører ", 1);
    }


    public String toString() {
        return this.getNavn() + this.getBeskrivelse();
    }

    public String look() {
        return toString();
    }
}

