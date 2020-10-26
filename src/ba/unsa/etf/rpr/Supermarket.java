package ba.unsa.etf.rpr;

public class Supermarket {
    private final int MAX_ARTIKALA = 1000;
    private Artikl[] artikli = new Artikl[MAX_ARTIKALA];
    private int brojTrenutnihArtikala = 0;

    public Artikl[] getArtikli() {
        return artikli;
    }

    void dodajArtikl(Artikl a) {
        if (brojTrenutnihArtikala == MAX_ARTIKALA) {
            return;
        }

        artikli[brojTrenutnihArtikala] = a;
        brojTrenutnihArtikala = brojTrenutnihArtikala + 1;
    }


    public Artikl izbaciArtiklSaKodom(String kod) {
        for (Artikl a: artikli) {
            if ()
        }
        return null;
    }
}
