package dk.hungarian.skabninger;


import dk.hungarian.Gender;
import dk.hungarian.Skabning;
import dk.hungarian.interfaces.Lookable;

public class Vampyr extends Skabning implements Lookable {
    int hugtændersStørrelse; //Kan være mellem 10-30 cm.

    public Vampyr(String navn, String beskrivelse, int styrke, Gender gender) { //Constructor fra Skabning
        super(navn, beskrivelse, styrke, gender);
        this.hugtændersStørrelse = hugtændersStørrelse; //Tilføjer min egen variabel til constructoren
    }

    public Vampyr(int hugtændersStørrelse){ //Constructor fra Skabning, hvor jeg har tilføjet min eget variabel.
        super("Vampyr", "Et fjendligt væsen, som angriber med sine farlige hugtænder, " +
                        "hvis du kommer for tæt på",
                70, Gender.HERMAFRODIT);
        this.hugtændersStørrelse = hugtændersStørrelse;
    }

    @Override
    public String toString(){ //Metode til at opsamle det hele.
        return "En " + this.getNavn() + " er dukket op. Du tjekker din pokédex for at finde en beskrivelse: \n"
                + this.getBeskrivelse() + ".\nDen har en styrke på " + this.getStyrke() + " med nogle store " +
                "hugtænder på " + this.hugtændersStørrelse + " cm. (WutFace)";
    }

    public String look(){
        return this.toString();
}


}