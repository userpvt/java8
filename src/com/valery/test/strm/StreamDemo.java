package com.valery.test.strm;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        IntSummaryStatistics sum = Stream.of("1", "2", "3", "5", "4", "7", "6")
                .map(Integer::valueOf)
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(sum);

    }

    /*List<String> strings = Arrays.asList("11", "22", "33", "44", "55", "36", "31");
        test1(strings);*/

    private static void test1(List<String> strings) {
        strings.stream()
                .map(s -> s + s)
                .map(s -> Integer.valueOf(s))
                .filter(value -> value > 3000)
                .sorted()
                .forEach(it -> System.out.println(it));
    }
}
