//made by Michael Trans

package dk.hungarian;

import dk.hungarian.genstande.Key;
import dk.hungarian.skabninger.*;
import dk.hungarian.genstande.Fakkel;
import dk.hungarian.genstande.BookofJK;

public class Test {

    // Her kommer testkoden for vores klasser
    // Vi modellerer, hvordan spillet kunne udspille sig.
    public static void test1(Player player) {

        System.out.println("********** Test START **********");

        // Vi lavede 2 metoder, der kan næsten det samme, men getPosition() returnerer en værdi,
        // mens ddsplayPosition blot udskriver, hvor spilleren befinder sig.
        // Vi skal kun bruge den ene...
        player.displayPosition();
        // System.out.println(player.getNavn() + " står på X" + player.getPosition()[0] + "Y" +player.getPosition()[1] + ".");

        // Vi snakkede også om, at man kan ikke instantiere en abstract klasse
        // Dvs. følgende kommer ikke til at virke, fordi Genstand er en abstract klasse
        // Genstand g = new Genstand();

        // Hvis en superklasse er IKKE abstract, så kan vi sagtens instantiere det.
        Skabning s = new Skabning("Frankenstein", "Frankenstein genopstrå fra de døde, for at skramme folk i Østeuropa.", 10, Gender.MAND);

        // Her tester vi en skabning og genstand
        System.out.println("--> Tester Master of Java og BookofJK");
        MasterofJava master = new MasterofJava();
        System.out.println(master.getNavn());
        System.out.println(master.getBeskrivelse());
        System.out.println(master.getStyrke());
        BookofJK javaknow = new BookofJK();
        System.out.println(javaknow.getNavn());
        System.out.println(javaknow.getBeskrivelse());
        System.out.println(javaknow.getStyrke());

        // Her tester vi en anden skabning og genstand
        System.out.println("--> Tester Key og Varulv");
        Key key = new Key();
        System.out.println(key.toString());
        Varulv varulv = new Varulv();
        System.out.println(varulv.toString());

        // Her tester vi en anden skabning og genstand
        System.out.println("--> Tester Normie");
        Normie normie = new Normie(12);
        System.out.println(normie.useBattleCry());

        // Her tester vi en anden skabning og genstand
        System.out.println("--> Tester Scammer");
        Scammer scammer = new Scammer(90);
        System.out.println(scammer.toString());

        // Her tester vi sur mor
        System.out.println("--> Tester SurMor");
        SurMor mor = new SurMor(90);
        System.out.println(mor.toString());

        // Her tester vi sur mor
        System.out.println("--> Tester Jokke B ");
        Joachim_B_Olsen jokke = new Joachim_B_Olsen(40);
        System.out.println(jokke.look());


        System.out.println("********** Test SLUT **********");

    }
}
