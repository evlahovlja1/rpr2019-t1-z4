package ba.unsa.etf.rpr;

public class Korpa {
    private final int MAX_ARITKALA = 50;
    private Artikl[] artikli = new Artikl[MAX_ARITKALA];
    private int trenutniBrojArtikala = 0;

    public boolean dodajArtikl(Artikl a) {
        if (trenutniBrojArtikala == MAX_ARITKALA) {
            return false;
        }

        artikli[trenutniBrojArtikala] = a;
        trenutniBrojArtikala = trenutniBrojArtikala + 1;
        return true;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i = 0; i < trenutniBrojArtikala; ++i) {
            Artikl a = artikli[i];

            if (a.getKod().equals(kod)) {
                System.arraycopy(artikli, i+1, artikli, i, artikli.length-i-1);
                trenutniBrojArtikala = trenutniBrojArtikala - 1;
                return a;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for (int i = 0; i < trenutniBrojArtikala; ++i) {
            suma = suma + artikli[i].getCijena();
        }
        return suma;
    }
}
