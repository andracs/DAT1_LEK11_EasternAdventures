package dk.hungarian.skabninger;

import dk.hungarian.Gender;
import dk.hungarian.Skabning;

public class NisseFar extends Skabning{
    private int hvorArrig = 100;
    


    public NisseFar(String navn, String beskrivelse, int styrke, Gender gender) {
        super(navn, beskrivelse, styrke, gender);
    }

    public NisseFar(int hvorArrig) {
        super("larsLykke", "Nissefar er meget farlig når han er 100% arrig!", 100, Gender.VATNISSE);
        this.hvorArrig = hvorArrig;
    }

    @Override
    public String toString(){
        return " Du er stødt på " + this.getNavn() + " og han er en " + hvor.Arrig + "%" + " arrig " + Gender + ", så pas på GroedSkeen!";
    }

    public int getHvorArrig() {
        return hvorArrig;
    }

    public void setHvorArrig(int hvorArrig) {
        this.hvorArrig = hvorArrig;
    }
}
