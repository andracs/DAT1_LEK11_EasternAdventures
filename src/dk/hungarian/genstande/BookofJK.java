package dk.hungarian.genstande;

import dk.hungarian.Genstand;
import dk.hungarian.interfaces.Lookable;

//Lavet af Michael (SaneStreet)
public class BookofJK extends Genstand {

    public BookofJK(String navn, String beskrivelse, int styrke) {
        super(navn, beskrivelse, styrke);
    }

    public BookofJK(){
        super("Introduktion til Java Programmering", "Bog nummer 1 indenfor læren og forståelsen af Java Programmering. Den kan øge din styrke med 100", 100);
    }

    public String look() {
        return "En meget tyk bog, med meget tynde sider, fyldt med volapyk. Held og lykke!";
    }
}
