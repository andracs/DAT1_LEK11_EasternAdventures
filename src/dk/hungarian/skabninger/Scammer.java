package dk.hungarian.skabninger;

import dk.hungarian.Gender;
import dk.hungarian.Skabning;

/** Mathias Elholm */

public class Scammer extends Skabning{

    int scamXP; // Vælg hvor meget XP scammeren har

    public Scammer(String navn, String beskrivelse, int styrke, Gender gender, Skabning scammer) {
        super(navn, beskrivelse, styrke, gender);

    }

    // Tilføjer en beskrivelse (String) til metoden look fra interface klassen.
    @Override
    public String look() {
        String desc = "# En Scammer som udgiver sig som en 'Sexy single Russian Lady' som ønsker lidt sexy-time #";
        return desc;
    }

    public Scammer(int scamXP){
        super("# Scammer ", "En Scammer som udgiver sig som en 'Sexy single Russian Lady' som ønsker lidt sexy-time #", 15, Gender.TRAP);
        this.scamXP = scamXP;

        if (scamXP >= 80){
            setStyrke(75);
            System.out.println("# Du hoppede på den, og overførte alle dine penge til scammeren, i håb om at der kom en 'Sexy single Russian Lady' til dig. #");
        }
        else if (scamXP < 79){
            setStyrke(20);
            System.out.println("# Du fattede mistanke, og var smart nok til ikke at enter dit kreditkort nummer og sende penge. #");
        }
    }
}
