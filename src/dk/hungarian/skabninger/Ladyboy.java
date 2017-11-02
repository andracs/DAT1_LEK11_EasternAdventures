package dk.hungarian.skabninger;

// Importerer nødvendige klasser
import dk.hungarian.Gender;
import dk.hungarian.Skabning;

public class Ladyboy extends Skabning {  // Klasse der extender "Skabning"

    private int antalBryster;

    public Ladyboy() { // Kaldes constructoren "Ladyboy" i main() vil den oprette nedenstående prædefinerede ladyboy
        super("Russian Nightmare", "Vanvittig krydsning mellem mand, kvinde og vodkadrikkende russer", 38, Gender.HERMAFRODIT);
        this.antalBryster = 3;
    }

    @Override
    public String toString() { // Overrider den oprindelige default "toString"
        String infoString = "Ladyboy'en ved navn " + getNavn() + " kan beskrives: " + getBeskrivelse() + ". " + getNavn() + " har en styrke på " + getStyrke() + ", en gender der er " + getGender() + ", og " + antalBryster + " bryster.";
        System.out.println(infoString);
        return infoString; // Returnerer "infoString"
    }

    public String look() {
        String beskrivelse = "En vanvittig krydsning mellem mand, kvinde og vodkadrikkende russer.";
        return beskrivelse;
    }
    
}