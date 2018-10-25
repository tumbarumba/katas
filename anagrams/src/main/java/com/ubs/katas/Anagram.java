package com.ubs.katas;

import java.util.Arrays;

public class Anagram {
    public String canonicalForm(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
