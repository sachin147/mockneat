package com.mockneat.types.enums;

/*
 * Copyright 2017, Andrei N. Ciobanu

 Permission is hereby granted, free of charge, to any user obtaining a copy of this software and associated
 documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
 persons to whom the Software is furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. PARAM NO EVENT SHALL THE AUTHORS OR
 COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER PARAM AN ACTION OF CONTRACT, TORT OR
 OTHERWISE, ARISING FROM, FREE_TEXT OF OR PARAM CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS PARAM THE SOFTWARE.
 */

import com.mockneat.types.Pair;

import java.util.List;

import static com.mockneat.types.enums.DictType.*;
import static java.util.Arrays.asList;

public enum HostNameType {
    ADJECTIVE_NOUN(
            asList(
                    new Pair<>(EN_ADJECTIVE_1SYLL, EN_NOUN_1SYLL),
                    new Pair<>(EN_ADJECTIVE_1SYLL, EN_NOUN_2SYLL),
                    new Pair<>(EN_ADJECTIVE_1SYLL, EN_NOUN_3SYLL),

                    new Pair<>(EN_ADJECTIVE_2SYLL, EN_NOUN_1SYLL),
                    new Pair<>(EN_ADJECTIVE_2SYLL, EN_NOUN_2SYLL),
                    new Pair<>(EN_ADJECTIVE_2SYLL, EN_NOUN_3SYLL),

                    new Pair<>(EN_ADJECTIVE_3SYLL, EN_NOUN_1SYLL),
                    new Pair<>(EN_ADJECTIVE_3SYLL, EN_NOUN_2SYLL),
                    new Pair<>(EN_ADJECTIVE_3SYLL, EN_NOUN_3SYLL)
            )
    ),

    ADVERB_VERB(
            asList(
                    new Pair<>(EN_ADVERB_1SYLL, EN_VERB_1SYLL),
                    new Pair<>(EN_ADVERB_1SYLL, EN_VERB_2SYLL),
                    new Pair<>(EN_ADVERB_1SYLL, EN_VERB_3SYLL),

                    new Pair<>(EN_ADVERB_2SYLL, EN_VERB_1SYLL),
                    new Pair<>(EN_ADVERB_2SYLL, EN_VERB_2SYLL),
                    new Pair<>(EN_ADVERB_2SYLL, EN_VERB_3SYLL),

                    new Pair<>(EN_ADVERB_3SYLL, EN_VERB_1SYLL),
                    new Pair<>(EN_ADVERB_3SYLL, EN_VERB_2SYLL),
                    new Pair<>(EN_ADVERB_3SYLL, EN_VERB_3SYLL)
            )
    ),

    ADJECTIVE_FIRST_NAME(
            asList(
                    new Pair<>(EN_ADJECTIVE_1SYLL, FIRST_NAME_MALE_AMERICAN),
                    new Pair<>(EN_ADJECTIVE_1SYLL, FIRST_NAME_FEMALE_AMERICAN),

                    new Pair<>(EN_ADJECTIVE_2SYLL, FIRST_NAME_MALE_AMERICAN),
                    new Pair<>(EN_ADJECTIVE_2SYLL, FIRST_NAME_FEMALE_AMERICAN),

                    new Pair<>(EN_ADJECTIVE_3SYLL, FIRST_NAME_MALE_AMERICAN),
                    new Pair<>(EN_ADJECTIVE_3SYLL, FIRST_NAME_FEMALE_AMERICAN)
            )
    ),

    NOUN_FIRST_NAME(
            asList(
                    new Pair<>(EN_NOUN_1SYLL, FIRST_NAME_MALE_AMERICAN),
                    new Pair<>(EN_NOUN_2SYLL, FIRST_NAME_MALE_AMERICAN),
                    new Pair<>(EN_NOUN_3SYLL, FIRST_NAME_MALE_AMERICAN),

                    new Pair<>(EN_NOUN_1SYLL, FIRST_NAME_FEMALE_AMERICAN),
                    new Pair<>(EN_NOUN_2SYLL, FIRST_NAME_FEMALE_AMERICAN),
                    new Pair<>(EN_NOUN_3SYLL, FIRST_NAME_FEMALE_AMERICAN)
            )
    );

    private final List<Pair<DictType, DictType>> dictCombos;

    HostNameType(List<Pair<DictType, DictType>> dictCombos) {
        this.dictCombos = dictCombos;
    }

    public List<Pair<DictType, DictType>> getDictCombos() {
        return dictCombos;
    }
}
