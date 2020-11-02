package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    private Supermarket s;
    private static Artikl a;

    @BeforeAll
    static void postaviArtikl() {
        a = new Artikl("Grah", 10, "12345");
    }

    @BeforeEach
    void resetKorpa() {
        s = new Supermarket();
    }

    @Test
    void dodavanjeArtiklaUPunuKorpuTrebaVratitiFalse() {
        for (int i = 0; i < 1000; ++i) {
            assertTrue(s.dodajArtikl(a));
        }

        assertFalse(s.dodajArtikl(a));
    }

    @Test
    void izbacivanjePostojecegArtikla() {
        s.dodajArtikl(a);
        assertNotNull(s.izbaciArtiklSaKodom(a.getKod()));
    }

    @Test
    void izbacivanjeNepostojecegArtikla() {
        s.dodajArtikl(a);
        s.dodajArtikl(a);
        assertNull(s.izbaciArtiklSaKodom("LOLOLOLO"));
    }
}