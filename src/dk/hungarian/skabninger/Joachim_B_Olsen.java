package dk.hungarian.skabninger;

import dk.hungarian.Gender;
import dk.hungarian.Skabning;
import dk.hungarian.interfaces.Lookable;

//Kasper Flensburg Petersen, redigeret 02/11/17
    public class Joachim_B_Olsen extends Skabning implements Lookable {

        private int iq;

        public Joachim_B_Olsen(int iq) {
            super("Joachim B Olsen", " er stærk, men ikke den hurtigste knallert på havnen!",50,
                    Gender.MAND);
            this.iq = iq;
        }

        public int getIq(){
            return this.iq;
        }
        public String toString(){
            return this.getNavn() + this.getBeskrivelse();
        }
        public String look(){
            return "Shit! Joachim B Olsen står foran dig. Skynd dig videre inden han begynder at diskutere med dig" +
                    " og trækker dig ned på hans egen IQ, eller han begynder at kaste med tunge kugler!";
        }
    }

