public class Programista extends Pracownik {

    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public Programista(String idPracownika, String imie, String nazwisko, double stawkaBazowa, String glownyJezyk, int liczbaRepozytoriow) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }

    public String getGlownyJezyk() { return glownyJezyk; }
    public int getLiczbaRepozytoriow() { return liczbaRepozytoriow; }

    @Override
    public double obliczKosztMiesieczny() {
        return getStawkaBazowa() + liczbaRepozytoriow * 500.0;
    }

    @Override
    public String przedstawSie() {
        return "Programista: " + getImie() + " " + getNazwisko() + " | Język: " + glownyJezyk + " | Repozytoria: " + liczbaRepozytoriow + " | Koszt miesięczny: " + obliczKosztMiesieczny() + " zł";
    }

    public void wypiszTechnologie() {
        System.out.println(getImie() + " " + getNazwisko() + " używa języka: " + glownyJezyk + " i prowadzi " + liczbaRepozytoriow + " repozytoriów.");
    }

    @Override
    public String toString() {
        return "Programista{is='" + pobierzIdPracownika() + "', imie='" + getImie() + "', nazwisko='" + getNazwisko() + "', glownyJezyk='" + glownyJezyk + "', liczbaRepozytoriow='" + liczbaRepozytoriow + "', kosztMiesieczny=" + obliczKosztMiesieczny() + "}";
    }
}
