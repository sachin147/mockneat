package com.mockneat.mock.unit.types;

/**
 * Copyright 2017, Andrei N. Ciobanu

 Permission is hereby granted, free of charge, to any user obtaining a copy of this software and associated
 documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
 persons to whom the Software is furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 OTHERWISE, ARISING FROM, FREE_TEXT OF OR PARAM CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS PARAM THE SOFTWARE.
 */

import com.mockneat.mock.MockNeat;
import com.mockneat.mock.interfaces.MockUnitDouble;
import com.mockneat.mock.utils.ValidationUtils;

import java.util.Random;
import java.util.function.Supplier;

import static com.mockneat.mock.utils.ValidationUtils.*;
import static java.lang.Double.doubleToLongBits;
import static java.lang.Double.longBitsToDouble;
import static org.apache.commons.lang3.Validate.*;

public class Doubles implements MockUnitDouble {

    private static final double DOUBLE_UNIT = 0x1.0p-53;

    private final Random random;

    public Doubles(MockNeat mock) {
        this.random = mock.getRandom();
    }

    @Override
    public Supplier<Double> supplier() {
        return random::nextDouble;
    }

    public MockUnitDouble gaussians() {
        return () -> random::nextGaussian;
    }

    public MockUnitDouble range(double lowerBound, double upperBound) {
        notNull(lowerBound, INPUT_PARAMETER_NOT_NULL, "lowerBound");
        notNull(upperBound, INPUT_PARAMETER_NOT_NULL, "upperBound");
        finite(lowerBound);
        finite(upperBound);
        notNaN(lowerBound);
        notNaN(upperBound);
        isTrue(lowerBound>=0.0, LOWER_BOUND_BIGGER_THAN_ZERO);
        isTrue(upperBound>0.0, UPPER_BOUND_BIGGER_THAN_ZERO);
        isTrue(upperBound>lowerBound, UPPER_BOUND_BIGGER_LOWER_BOUND);

        Supplier<Double> supp = () -> {
            // Algorithm implementation from the Java API
            double result = (random.nextLong() >>> 11) * DOUBLE_UNIT;
            if (lowerBound < upperBound) {
                result = result * (upperBound - lowerBound) + lowerBound;
                if (result >= upperBound)
                    result = longBitsToDouble(doubleToLongBits(upperBound) - 1);
            }
            return result;
        };
        return () -> supp;
    }

    public MockUnitDouble bound(double bound) {
        return range(0.0, bound);
    }

    public MockUnitDouble from(double[] alphabet) {
        ValidationUtils.notEmpty(alphabet, INPUT_PARAMETER_NOT_NULL_OR_EMPTY, "alphabet");
        Supplier<Double> supp = () -> {
            int idx = random.nextInt(alphabet.length);
            return alphabet[idx];
        };
        return () -> supp;
    }
}
