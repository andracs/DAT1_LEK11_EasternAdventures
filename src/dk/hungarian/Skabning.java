package dk.hungarian;

import dk.hungarian.interfaces.Lookable;

public class Skabning implements Lookable {
    private String navn;
    private String beskrivelse;
    private int styrke;
    private Gender gender;

    public Skabning()   {

    }

    public Skabning(String navn, String beskrivelse, int styrke, Gender gender) {
        this.navn = navn;
        this.beskrivelse = beskrivelse;
        this.styrke = styrke;
        this.gender = gender;
    }

    public static void yo() {
        System.out.println("YO");
    }

    public String getNavn() {
        return navn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public int getStyrke() {
        return styrke;
    }

    public Gender getGender() {
        return gender;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public void setStyrke(int styrke) {
        this.styrke = styrke;
    }
}
