package dk.hungarian;

import dk.hungarian.genstande.*;
import dk.hungarian.skabninger.*;

public class Kort {
    public Felt[][] kort = new Felt[10][10];

    /* Constructoren opretter et kort for Eastern Adventures,
     * og fylder det op med 10x10 Felt objekter */
    public Kort() {
        for (int y = 0; y < 10; y++)
        {
            for (int x = 0; x < 10; x++) {
                Felt feltet = new Felt();
                kort[x][y] = feltet;
            }
        }

        // Tilføjer flere skabninger og items på en diagonal linje på kortet
        Alien alien = new Alien("E.T.", "E.T. er en botaniker fra det ydre rum, som vil bare så gerne tage hjem.", 10, Gender.UKØNNET, 750, "Brodo Asog");
        kort[1][1].skabning = alien;
        LaserPistol laserPistol = new LaserPistol();
        kort[1][1].genstand[0] = laserPistol;
        Ladyboy nimnam = new Ladyboy();
        kort[2][2].skabning = nimnam;
        Vodka vodka = new Vodka();
        kort[2][2].genstand[0] = vodka;
        MasterofJava master = new MasterofJava();
        kort[3][3].skabning = master;
        BookofJK book = new BookofJK();
        kort[3][3].genstand[0] = book;
        Normie normie = new Normie(20);
        kort[4][4].skabning = normie;
        FireStrengetLut lut = new FireStrengetLut(12);
        kort[4][4].genstand[0] = lut;
        //Scammer scammer = new Scammer(20);
        //kort[5][5].skabning = scammer;
        AK47 ak47 = new AK47("Bingbang", "En maskingevær, lidt slidt.", 100);
        kort[5][5].genstand[0] = ak47;

        // Tilføjer Helle Thorning på 9,9, for hun er en final boss
        Helle_Thorning helle = new Helle_Thorning(5);
        kort[9][9].skabning = helle;

        // Gemmer Nissefar på kortet 0,0
        NisseFar nisse = new NisseFar(100);
        kort[0][0].skabning = nisse;










    }

}
