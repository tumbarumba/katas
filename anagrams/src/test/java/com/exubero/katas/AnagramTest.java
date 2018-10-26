package com.exubero.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {

    @Test
    public void canFindCanonicalFormOfAWord() {
        Anagram anagram = new Anagram();

        assertEquals("a",           anagram.canonicalForm("a"));
        assertEquals("act",         anagram.canonicalForm("cat"));
        assertEquals("aaaaabbcdrr", anagram.canonicalForm("Abracadabra"));
    }

}