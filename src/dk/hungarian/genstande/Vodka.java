package dk.hungarian.genstande;

import dk.hungarian.Genstand; // Importerer nødvendig klasse

public class Vodka extends Genstand { // Denne klasse extender den abstrakte klasse "Genstand"

    public Vodka() { // Kaldes constructoren "Vodka" i main() vil den oprette nedenstående prædefinerede vodka
        super("Royal Dragon Imperial", "Royal Dragon vodka er en rigtig luksus vodka, brygget efter en gammel russisk opskrift", 100);
    }

    @Override
    public String toString() { // Overrider den oprindelige default "toString"
        String infoString = getNavn() + " er en vodka, der kan beskrives: " + getBeskrivelse() + "." + " Genstanden har en styrke på: " + getStyrke() + ".";
        System.out.println(infoString);
        return infoString; // Returnerer "infoString"
    }

    public String look() {
        String beskrivelse = "En dyr luksus vodka ved navn Royal Dragon, brygget efter gammel russisk opskrift.";
        return beskrivelse;
    }

}