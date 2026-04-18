public class Tester extends Pracownik {

    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika, String imie, String nazwisko, double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    public boolean isCzyAutomatyzujacy() { return czyAutomatyzujacy; }
    public int getLiczbaScenariuszy() { return liczbaScenariuszy; }

    @Override
    public double obliczKosztMiesieczny() {
        double koszt = getStawkaBazowa() + liczbaScenariuszy * 50.0;
        if (czyAutomatyzujacy) {
            koszt *= 1.15;
        }
        return koszt;
    }

    @Override
    public String przedstawSie() {
        return "Tester: " + getImie() +  " " + getNazwisko() + " | Automatyzujący: " + (czyAutomatyzujacy ? "TAK" : "NIE") + " | Scenariusze: " + liczbaScenariuszy + " | Koszt miesięczny: " + String.format("%.2f", obliczKosztMiesieczny()) + " zł";
    }

    public void uruchomRaportTestow() {
        System.out.println("=== Raport testów: " + getImie() + " " + getNazwisko() + "===");
        System.out.println("Typ testów: " + (czyAutomatyzujacy ? "Automatycznie" : "Ręcznie"));
        System.out.println("Liczba scenariuszy: " + liczbaScenariuszy);
        System.out.println("Status: Raport wygenerowany pomyślnie.");
    }

    @Override
    public String toString() {
        return "Tester{id='" + pobierzIdPracownika() + "', imie='" + getImie() + "', nazwisko='" + getNazwisko() + "', czyAutomatyzujacy=" + czyAutomatyzujacy + ", liczbaScenariuszy=" + liczbaScenariuszy + ", kosztMiesieczny=" + String.format("%.2f", obliczKosztMiesieczny()) + "}";
    }
}