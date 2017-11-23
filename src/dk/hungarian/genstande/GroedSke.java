package dk.hungarian.genstande;

import dk.hungarian.Genstand;

public class GroedSke extends Genstand{
        //
    int slaaStyrke = 100;

    public GroedSke(int slaaStyrke) {
        super("GroedSke", "Wam Bam Smask", 100);
    }

 //   @Override
 //   public int getStyrke() {
 //       return super.getStyrke();
 //   }
 public String GroedSke(){
     return "Hold dig fra min varme grød, eller du får tæsk med min GroedSke";
 }


    public String look() {
        String beskrivelse = "En farlig GrødSke som NisseFar holder alle rotterne væk med!";
        return beskrivelse;
    }
}
