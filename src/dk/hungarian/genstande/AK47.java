package dk.hungarian.genstande;

import dk.hungarian.Genstand;

public class AK47 extends Genstand {

    public AK47(String navn, String beskrivelse, int styrke) {
        super(navn, beskrivelse, styrke);
    }

    public String look() {
        return "AK-47 (russisk: Автомат Калашникова, tr. Avtomat Kalasjnikova), ofte blot kaldet Kalasjnikov (eng: Kalashnikov), er et stormgevær, som er designet af Mikhail Kalasjnikov, produceret af den russiske våbenproducent, IZH.\n" +
                "\n" +
                "AK-47'en blev især anvendt af Warszawapagtens styrker under den kolde krig. Geværet er i dag det mest kendte skydevåben, der nogensinde er blevet produceret. Der er i dag 100 mio. eksemplarer i verden.";
    }
}
