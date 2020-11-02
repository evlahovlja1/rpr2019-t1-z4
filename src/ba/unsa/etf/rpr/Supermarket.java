package ba.unsa.etf.rpr;

public class Supermarket {
    private final int MAX_ARTIKALA = 1000;
    private Artikl[] artikli = new Artikl[MAX_ARTIKALA];
    private int brojTrenutnihArtikala = 0;

    public Artikl[] getArtikli() {
        return artikli;
    }

    boolean dodajArtikl(Artikl a) {
        if (brojTrenutnihArtikala == MAX_ARTIKALA) {
            return false;
        }

        artikli[brojTrenutnihArtikala] = a;
        brojTrenutnihArtikala = brojTrenutnihArtikala + 1;
        return true;
    }


    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i = 0; i < brojTrenutnihArtikala; ++i) {
            Artikl a = artikli[i];

            if (a.getKod().equals(kod)) {
                System.arraycopy(artikli, i+1, artikli, i, artikli.length- i - 1);
                brojTrenutnihArtikala = brojTrenutnihArtikala - 1;
                return a;
            }
        }
        return null;
    }
}
