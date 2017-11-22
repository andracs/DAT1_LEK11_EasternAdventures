package dk.hungarian.genstande;

import dk.hungarian.Genstand;

/** Mathias Elholm **/

public class Laks extends Genstand {



    public Laks(String navn, String beskrivelse, int styrke) {
        super(navn, beskrivelse, styrke);

    }
    // Tilføjer en beskrivelse (String) til metoden look fra interface klassen.


    public String look() {
        String desc = "# En våd slimet og lugtende laks! #";
        return desc;
    }

    public Laks(){
        super("# Laks:", " den er våd, slimet og lugtende! #", 15);
    }


}
