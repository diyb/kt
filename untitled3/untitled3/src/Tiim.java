// Tiim, nt korvpallitiim või ujumismeeskond
public class Tiim extends Voistleja {
    private int liikmeteArv;

    public Tiim(String nimi, String spordiala, int liikmeteArv) {
        super(nimi, spordiala);
        this.liikmeteArv = liikmeteArv;
    }


    public String voistle() {
        return "Tiim " + nimi + " (" + liikmeteArv + " liiget) v6istleb alal " + spordiala;
    }
}