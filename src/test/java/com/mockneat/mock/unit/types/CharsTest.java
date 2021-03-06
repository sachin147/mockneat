package com.mockneat.mock.unit.types;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

import static com.mockneat.alphabets.Alphabets.*;
import static com.mockneat.mock.Constants.CHARS_CYCLES;
import static com.mockneat.mock.Constants.M;
import static com.mockneat.mock.Constants.MOCKS;
import static com.mockneat.mock.utils.LoopsUtils.loop;
import static java.util.Arrays.stream;

public class CharsTest {

    protected void inAlpabet(List<Character> alphabet, Supplier<Character> charSuppl) {
        Set<Character> possibleDigits = new HashSet<>(alphabet);
        loop(CHARS_CYCLES, () -> {
            char c = charSuppl.get();
            Assert.assertTrue(possibleDigits.contains(c));
        });
    }

    @Test
    public void testAlphaNumeric() throws Exception {
        stream(MOCKS).forEach(rand ->
                inAlpabet(ALPHA_NUMERIC, rand.chars()::val));
    }

    @Test
    public void testDigits() throws Exception {
        stream(MOCKS).forEach(rand ->
                inAlpabet(DIGITS, rand.chars().digits()::val));
    }

    @Test
    public void testLowerLetters() throws Exception {
        stream(MOCKS).forEach(rand ->
                inAlpabet(LETTERS_LOWERCASE, rand.chars().lowerLetters()::val));
    }

    @Test
    public void testUpperLetters() throws Exception {
        stream(MOCKS).forEach(rand ->
                inAlpabet(LETTERS_UPPERCASE, rand.chars().upperLetters()::val));
    }

    @Test
    public void testLetters() throws Exception {
        stream(MOCKS).forEach(rand ->
                inAlpabet(LETTERS, rand.chars().letters()::val));
    }

    @Test
    public void testHexa() throws Exception {
        stream(MOCKS).forEach(rand ->
                inAlpabet(HEXA, rand.chars().hex()::val));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromStringEmptyAlphabet() throws Exception {
        String alphabet = "";
        M.chars().from(alphabet).val();
    }

    @Test(expected = NullPointerException.class)
    public void testFromStringNullAlphabet() throws Exception {
        String alphabet = null;
        M.chars().from(alphabet).val();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromArrayEmpty() throws Exception {
        char[] alphabet = {};
        M.chars().from(alphabet).val();
    }

    @Test(expected = NullPointerException.class)
    public void testFromArrayNull() throws Exception {
        char[] alphabet = null;
        M.chars().from(alphabet).val();
    }
}
