package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private Korpa k;
    private static Artikl a;

    @BeforeAll
    static void postaviArtikl() {
        a = new Artikl("Grah", 10, "12345");
    }

    @BeforeEach
    void resetKorpa() {
        k = new Korpa();
    }

    @Test
    void dodavanjeArtiklaUPunuKorpuTrebaVratitiFalse() {
        for (int i = 0; i < 50; ++i) {
            assertTrue(k.dodajArtikl(a));
        }

        assertFalse(k.dodajArtikl(a));
    }

    @Test
    void izbacivanjePostojecegArtikla() {
        k.dodajArtikl(a);
        assertNotNull(k.izbaciArtiklSaKodom(a.getKod()));
    }

    @Test
    void izbacivanjeNepostojecegArtikla() {
        k.dodajArtikl(a);
        k.dodajArtikl(a);
        assertNull(k.izbaciArtiklSaKodom("LOLOLOLO"));
    }

    @Test
    void getUkupnaCijenaArtikala() {
        for (int i = 0; i < 10; ++i) {
            k.dodajArtikl(a);
        }

        assertEquals(100, k.dajUkupnuCijenuArtikala());
    }

    @Test
    void getUkupnaCijenaArtikalaKadaNemaArtikala() {
        assertEquals(0, k.dajUkupnuCijenuArtikala());
    }


}