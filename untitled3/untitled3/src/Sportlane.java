
public class Sportlane extends Voistleja {

    public Sportlane(String nimi, String spordiala) {
        super(nimi, spordiala);
    }


    public String voistle() {
        return "Sportlane " + nimi + " võistleb alal " + spordiala;
    }
}