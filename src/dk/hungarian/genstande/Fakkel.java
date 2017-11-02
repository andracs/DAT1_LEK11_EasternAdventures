package dk.hungarian.genstande;

import dk.hungarian.Genstand;
import dk.hungarian.interfaces.Lookable;

public class Fakkel extends Genstand implements Lookable {
int levetid; //Kan lyse fra 0-100 sekunder.

    public Fakkel(String navn, String beskrivelse, int styrke) { //Constructor fra Genstand
        super(navn, beskrivelse, styrke); //Genstand's variabler
        this.levetid = levetid; //Tilføjer min egen variabel
    }

    public Fakkel(int levetid){ //Constructor hvor jeg har tilføjet "levetid"
        super("Fakkel", "Primære funktion er at give lys", 5);
        this.levetid = levetid;
    }

    @Override
    public String toString(){ //Metode til at opsamle det hele.
        return "\nDu har samlet en " + this.getNavn() + " op som har beskrivelsen: \n" + this.getBeskrivelse() +
                " med en styrke på " + this.getStyrke() + " og den kan lyse i " + this.levetid + " sekunder.";
    }

    public String look(){
        return this.toString();
    }
}

