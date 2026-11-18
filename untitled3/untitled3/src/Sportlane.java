
public class Sportlane extends Voistleja {

    public Sportlane(String nimi, String spordiala) {
        this.nimi = nimi;
        this.spordiala = spordiala;
    }


    public String voistle() {
        return "Sportlane " + nimi + " võistleb alal " + spordiala;
    }
}
