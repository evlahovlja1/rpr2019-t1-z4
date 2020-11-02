package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {
    private Artikl a;

    @BeforeEach
    void resetArtikla() {
        a = new Artikl("Grah", 10, "12345");
    }

    @Test
    void testGetNaziv() {
        assertEquals("Grah", a.getNaziv());
    }

    @Test
    void testGetCijena() {
        assertEquals(10, a.getCijena());
    }

    @Test
    void testGetKod() {
        assertEquals("12345", a.getKod());
    }
}