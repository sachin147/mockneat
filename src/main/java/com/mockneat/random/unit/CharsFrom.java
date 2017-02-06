package com.mockneat.random.unit;

import com.mockneat.random.Rand;
import com.mockneat.random.unit.interfaces.RandUnit;

/**
 * Created by andreinicolinciobanu on 25/01/2017.
 */
public class CharsFrom implements RandUnit<Character> {

    private Rand rand;
    private char[] alphabet;
    private String alphabetStr;

    public CharsFrom(Rand rand, char[] alphabet) {
        this.rand = rand;
        this.alphabet = alphabet;
    }

    public CharsFrom(Rand rand, String alphabetStr) {
        this.rand = rand;
        this.alphabetStr = alphabetStr;
    }

    @Override
    public Character val() {
        if (alphabet==null) {
            int idx = rand.ints().withBound(alphabetStr.length()).val();
            return alphabetStr.charAt(idx);
        } else {
            int idx = rand.ints().withBound(alphabet.length).val();
            return alphabet[idx];
        }
    }

    @Override
    public Rand getRand() {
        return this.rand;
    }
}