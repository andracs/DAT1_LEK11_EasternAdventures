package dk.hungarian.skabninger;

import dk.hungarian.Gender;
import dk.hungarian.Skabning;

public class SurMor extends Skabning {
    //Johans arbejde
    //Hvor sur er hun
    int hvorSur;

    //Constructor til surmor.
    public SurMor(int hvorSur) {
        super("Olga", "En sur russisk mor", 0, Gender.KVINDE);
        //Hendes styrke er by default 0, men lig med hendes surhed.
        this.hvorSur = hvorSur;
        this.setStyrke(hvorSur);

    }

    public String look() {
        return "Du ser på en sur russisk mor. Pas på, jo mere sur hun bliver jo mere skader hun!";
    }

    @Override
    public String toString() {
        return "Du er stødt på " + this.getNavn() + "(" + this.getBeskrivelse() + ") der har en surhedsgrad på: " + this.getStyrke() + ".";

        //Se fluffybunny_sværd klassen for kode til testklassen.
    }
}