/*
 *
 */
package dk.hungarian;

import dk.hungarian.genstande.Key;
import dk.hungarian.genstande.FluffyBunny_sværd;
import dk.hungarian.skabninger.SurMor;
import dk.hungarian.skabninger.Normie;
import dk.hungarian.skabninger.Scammer;

import java.util.Scanner;

public class Main {

    private final static Boolean DEBUG = false; // Vi indbygger en debug mode i vores kode, så vi ikke behøver at spille spillet hver gange, vi tester
    private static Kort kortet = new Kort();
    private static Player player;

    /* Main classen starter spillet, og bringer alle de andre klasser i spil. */
    public static void main(String[] args) {



        if (DEBUG) {
            player = new Player("Hans");
        } else {
            System.out.println("Velkommen. Indtast dit navn:");
            Scanner input = new Scanner(System.in);
            String navn = input.next();
            player = new Player(navn);
        }

        if (DEBUG) {
            Test.test1(player);
            System.exit(1);
        }

        // Main loop
        boolean keepPlaying = true;
        Scanner scanner = new Scanner(System.in);
        while (keepPlaying) {
            System.out.println("Hvad vil du foretage dig? (op, ned, venstre, højre, se, grave, slut) ");
            String kommandoFraBruger = scanner.next();
            String svarTilBruger = "";
            switch (kommandoFraBruger) {
                case "op":
                case "ned":
                case "højre":
                case "venstre":
                    player.move(kommandoFraBruger);
                    svarTilBruger = "";
                    break;
                case "se":
                    svarTilBruger = lookAtThings();
                    break;
                case "slut":
                    keepPlaying = false;
                    svarTilBruger = "Tak for denne gang. Dit spil gemmes (når programmøren har fået implementeret gem funktion.)";
                    break;
                default:
                    svarTilBruger = "Kan ikke forstå kommandoen \"" + kommandoFraBruger + "\", desværre.";
            }
            if (svarTilBruger != "") System.out.println(svarTilBruger);
        }

        // Test til Leaderboard klassen
        Leaderboard.add(player);

    }

    private static String lookAtThings() {
        String hvadErDerAtSe = "Du ser dig omkring... ";
        int[] position = player.getPosition();
        int playerX = position[0];
        int playerY = position[1];
        Felt felt = kortet.kort[playerX][playerY];
        hvadErDerAtSe += felt.beskrivelse + " ";
        if (felt.skabning != null) hvadErDerAtSe += "Der står " + felt.skabning.getNavn() + " foran dig. " + felt.skabning.getBeskrivelse() + " "; else {hvadErDerAtSe += "Der er ikke skabninger omkring. "; }
        return hvadErDerAtSe;
    }
}
