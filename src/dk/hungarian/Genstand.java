package dk.hungarian;

import dk.hungarian.interfaces.Lookable;

public abstract class Genstand implements Lookable {
    String navn;
    String beskrivelse;
    int styrke;

    public Genstand()  {

    }

    public Genstand(String navn, String beskrivelse, int styrke) {
        this.navn = navn;
        this.beskrivelse = beskrivelse;
        this.styrke = styrke;
    }


    public String getNavn() {
        return navn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public int getStyrke() {
        return styrke;
    }
}
