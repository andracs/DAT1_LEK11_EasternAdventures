package dk.hungarian;

import java.util.ArrayList;

public class Player {
    private String navn;
    private ArrayList inventory;
    private int positionX = 4;
    private int positionY = 4;
    private int point = 0;

    /* Constructor */
    public Player(String navn) {
        this.navn = navn;
        System.out.println("Velkommen til EasterAdventures, " + navn + "!");
    }

    /* Viser position direkte på System.out */
    public void displayPosition() {
        System.out.println("Du står på X" + positionX + "Y" + positionX + ".");
    }

    /* Returnererer et array med spillerens X og Y koordinater [int x, int y]  */
    public int[] getPosition() {
        int[] position = new int[2];
        position[0] = positionX;
        position[1] = positionY;
        return position;
    }

    public String move(String retning) {
        String svarTilBruger = "";
        switch (retning) {
            case "op":
                if (positionY > 0) {
                    --positionY;
                } else {
                    svarTilBruger = "Du prøver, men kan ikke gå " + retning + " fra X" + positionX + "Y" + positionY + ".";
                }
                break;
            case "ned":
                if (positionY < 9) {
                    ++positionY;
                } else {
                    svarTilBruger = "Du prøver, men kan ikke gå " + retning + " fra X" + positionX + "Y" + positionY + ".";
                }
                break;
            case "venstre":
                if (positionX > 0) {
                    --positionX;
                } else {
                    svarTilBruger = "Du prøver, men kan ikke gå " + retning + " fra X" + positionX + "Y" + positionY + ".";
                }
                break;
            case "højre":
                if (positionX < 9) {
                    ++positionX;
                } else {
                    svarTilBruger = "Du prøver, men kan ikke gå " + retning + " fra X" + positionX + "Y" + positionY + ".";
                }
                break;
        }
        if (svarTilBruger == "") {
            svarTilBruger = "Du går " + retning + ", og ender på X" + positionX + "Y" + positionY;
        }
        System.out.println(svarTilBruger);
        return svarTilBruger;

    }


    /* Getters og setters for spillerens navn */
    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }
    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
