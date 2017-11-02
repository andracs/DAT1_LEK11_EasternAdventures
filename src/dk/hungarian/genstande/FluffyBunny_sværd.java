package dk.hungarian.genstande;

import dk.hungarian.Genstand;

public class FluffyBunny_sværd extends Genstand {
    //Johans arbejde
    //Tilføjer en lyd til sværdet.
    String lyd = "Ffffkrrrrshhzzzwooooom..woom..woooom..";

    //Getters til sværdet. lyden ændre sig ikke så kun getters.
    public String getLyd() {
        return lyd;
    }

    //Constructor
    public FluffyBunny_sværd() {
        //Navn, beskrivelse og styrke.
        super("FluffyBunny", "Legendarisk sværd", 100);
        this.lyd = lyd;
    }
    public String look(){
        return "Du ser på et pink lysende sværd på jorden. Græsset omkring sværet er helt brændt ned.";
    }
    @Override
    public String toString(){
        return "Du er tæt på på" + this.getNavn() + "(" + this.getBeskrivelse() + "). Du laver et par slag ud i luften.." + this.getLyd() + ". Du kan mærke kraften fra sværdet gennemstrømme din krop.";
    }


    }


/*Til at køre klasserne (Virker)
        SurMor surmor = new SurMor(25);
        System.out.println("Skabning " + surmor.getNavn() + "(" + surmor.getBeskrivelse() + ") har en surhedsgrad på: " + surmor.getStyrke() + ".");
        FluffyBunny_sværd fluffybunny = new FluffyBunny_sværd();
        System.out.println("Sværd " + fluffybunny.getNavn() + "(" + fluffybunny.getBeskrivelse() + "). Du laver et par slag ud i luften.." + fluffybunny.getLyd() + ". Du kan mærke kraften fra sværdet gennemstrømme din krop.");

        Kode til at køre sværdet. ToString virker på begge nu.
        FluffyBunny_sværd fluffyBunny = new FluffyBunny_sværd();
        System.out.println(fluffyBunny.toString());
*/





