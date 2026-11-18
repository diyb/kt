import java.util.ArrayList;


public class Riik {
    private String nimi;
    private ArrayList<Voistleja> voistlejad = new ArrayList<>();

    public Riik(String nimi) {
        this.nimi = nimi;
    }


    public void lisaVoistleja(Voistleja v) {
        voistlejad.add(v);
    }


    public void koikVoistlevad() {
        System.out.println("=== " + nimi + " ===");
        for (Voistleja v : voistlejad) {
            System.out.println(v.voistle());
        }
    }
}