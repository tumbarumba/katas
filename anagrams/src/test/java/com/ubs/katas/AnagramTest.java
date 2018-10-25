package com.ubs.katas;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

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