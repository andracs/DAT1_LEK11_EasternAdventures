package dk.hungarian.skabninger;

import dk.hungarian.Gender;
import dk.hungarian.Skabning;
import dk.hungarian.interfaces.Lookable;

public class Normie  extends Skabning  {
    int feministLVL; // 1...100

    public Normie(int feministLVL){
        super("Normie","Kæft en normie",1,Gender.TRAP);
        this.feministLVL = feministLVL;
    }


    public String useBattleCry() {
        if (feministLVL >50) { return "reee! My feminist LVL is " + feministLVL + ", cuz im swedish!"; }
        else {return "reee! My feminist LVL is " + feministLVL + ", cuz im not swedish!";}
    }

    @Override
    public String look() {
        return "En Normie, nordens største trussel, direkte fra helvede kaldet sverige( ͡° ͜ʖ ͡°)";
    }
}
