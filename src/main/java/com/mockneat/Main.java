package com.mockneat;

import com.mockneat.mock.MockNeat;

import java.util.stream.IntStream;

import static java.util.Locale.CHINA;

/**
 * Created by andreinicolinciobanu on 15/01/2017.
 */
public class Main {

    public static void main(String[] args) {
        IntStream.range(0, 10).forEach(i -> {
            System.out.println(MockNeat.threadLocal().iPv6s().val());
        });

        MockNeat r = MockNeat.threadLocal();
        System.out.println(r.money().locale(CHINA).val());
    }
}
