package com.exubero.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnagramTest {

    @Test
    public void canFindCanonicalFormOfAWord() {
        Anagram anagram = new Anagram();

        assertEquals("a",           anagram.canonicalForm("a"));
        assertEquals("act",         anagram.canonicalForm("cat"));
        assertEquals("aaaaabbcdrr", anagram.canonicalForm("Abracadabra"));
    }

}