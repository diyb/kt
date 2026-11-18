// Ühine klass kõigile võistlejatele (sportlane ja tiim)
public abstract class Voistleja {
    protected String nimi;
    protected String spordiala;

    public Voistleja(String nimi, String spordiala) {
        this.nimi = nimi;
        this.spordiala = spordiala;
    }

    public abstract String voistle();
}