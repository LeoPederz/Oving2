package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberTest {


    @Test
    void shouldConvert1ToI() {

        assertEquals("I", RomanNumber.toRoman(1));
    }

    @Test
    void shouldConvert2ToII() {

        assertEquals("II", RomanNumber.toRoman(2));
    }

    @Test
    void shouldConvert3ToIII() {

        assertEquals("III", RomanNumber.toRoman(3));
    }

}

