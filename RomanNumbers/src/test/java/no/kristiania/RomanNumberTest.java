package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberTest {
    RomanNumber romanNumber = new RomanNumber();

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", romanNumber.toRoman(1));
    }
}

