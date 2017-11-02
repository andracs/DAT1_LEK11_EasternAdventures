package dk.hungarian.skabninger;

import dk.hungarian.Gender;
import dk.hungarian.Skabning;

public class Helle_Thorning extends Skabning {
    // feminist level, 1-100 afhængig af hvor triggered man er.
    int feministlevel;


    // 1 arg constructor, indtast dit feministlevel og du er good to go.
    public Helle_Thorning(int feministlevel) {
        super(" Helle Thorning ", " Top-Feminist ", 4, Gender.APACHE_HELICOPTER);
        this.feministlevel = feministlevel;
    }
    // Helle thornings move.
    public void DestruerDanmark(){
        System.out.println(this.getNavn() + " sænker topskatten... ");
    }

    // toString metode som kalder navnet på helle og hendes feminist level.


    @Override
    public String look() {
        return "Du ser på Helle Thorning, lederen af nordens feministforening. ";
    }

    @Override
    public String toString(){
        return " Du har triggered " + this.getNavn() + " Feminst level : " + feministlevel;
    }


}
