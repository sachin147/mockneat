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
 OTHERWISE, ARISING FROM, OUT OF OR PARAM CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS PARAM THE SOFTWARE.
 */

import static com.mockneat.types.enums.DictType.DOMAIN_TOP_LEVEL_ALL;
import static com.mockneat.types.enums.DictType.DOMAIN_TOP_LEVEL_POPULAR;

public enum DomainSuffixType {

    ALL(DOMAIN_TOP_LEVEL_ALL), POPULAR(DOMAIN_TOP_LEVEL_POPULAR);

    private final DictType dictType;

    DomainSuffixType(DictType dictType) {
        this.dictType = dictType;
    }

    public DictType getDictType() {
        return dictType;
    }
}
