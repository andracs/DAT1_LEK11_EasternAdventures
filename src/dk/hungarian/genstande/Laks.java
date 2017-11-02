package dk.hungarian.genstande;

import dk.hungarian.Genstand;

/** Mathias Elholm **/

public class Laks extends Genstand {



    public Laks(String navn, String beskrivelse, int styrke) {
        super(navn, beskrivelse, styrke);

    }

    public Laks(){
        super("# Laks:", " den er våd, slimet og lugtende! #", 15);
    }

    public String look() {
        return null;
    }
}
