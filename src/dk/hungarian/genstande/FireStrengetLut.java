package dk.hungarian.genstande;

import dk.hungarian.Genstand;

public class FireStrengetLut extends Genstand {
    int pusMagnetLVL; // 1 ...100

    public FireStrengetLut(int pusMagnetLVL) {
        super("4 Strenget Lut", "69, det er en sex ting", 69);
        this.pusMagnetLVL = pusMagnetLVL;
    }

    public String pudsLuten(){
        return "Kunne du tænke dig at se min kæmpe, store, fede.... 4 strenget lut";
    }

    @Override
    public String look() {
        return "En lut, der er blevet lavet af et egern, noget snor og en Lut";
    }

}
