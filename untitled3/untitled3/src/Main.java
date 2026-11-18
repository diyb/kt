public class Main {
    public static void main(String[] args) {

        Riik eesti = new Riik("Eesti");
        Riik soome = new Riik("Soome");


        eesti.lisaVoistleja(new Tiim("Korvpallikoondis", "korvpall", 12));
        eesti.lisaVoistleja(new Sportlane("Magnus Kirt", "odavise"));


        soome.lisaVoistleja(new Tiim("Ujumismeeskond", "ujumine", 4));
        soome.lisaVoistleja(new Sportlane("Pekka", "sprint"));

        eesti.koikVoistlevad();
        soome.koikVoistlevad();
    }
}