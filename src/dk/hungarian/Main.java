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

    private final static Boolean DEBUG = true; // Vi indbygger en debug mode i vores kode, så vi ikke behøver at spille spillet hver gange, vi tester

    /* Main classen starter spillet, og bringer alle de andre klasser i spil. */
    public static void main(String[] args) {

        Kort kortet = new Kort();
        Player player;

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
                    //
                    break;
                case "slut":
                    keepPlaying = false;
                    svarTilBruger = "Tak for denne gang. Dit spil gemmes (når programmøren har fået implementeret gem funktion.)";
                    break;
                default:
                    svarTilBruger = "Kan ikke forstå kommandoen \\\"\" + kommandoFraBruger + \"\\\", desværre.";
            }
            if (svarTilBruger != "") System.out.println(svarTilBruger);
        }
    }
}
