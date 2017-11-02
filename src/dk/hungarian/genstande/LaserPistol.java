package dk.hungarian.genstande;

import dk.hungarian.Genstand;

// Klassen er lavet af erik2310

public class LaserPistol extends Genstand {

    public LaserPistol() {
        super("Laser Pistol", "En laser pistol som aliens kan skyde med.", 50);
    }


    public String look() {
        return "Du ser en Laser Pistol.";
    }
}
