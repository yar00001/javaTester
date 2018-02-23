package stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparingInt;

class StreamPlay {

    @Test
    void test_1() {
        List<String> list = Arrays.asList("one", "two", "three", "four");

        list
            .stream()
            .filter(w -> w.startsWith("t"))
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);
    }


    @Test
    void item_42_lambda_over_anonymous_class() {
        List<String> list = Arrays.asList("one", "two", "three", "four");

        // OLD Method - using anonymous class
        Collections.sort(list, new Comparator<String>() {
            public int compare(String w1, String w2) {
                return Integer.compare(w1.length(), w2.length());
            }
        });

        list = Arrays.asList("one", "two", "three", "four");

        // NEW method - using lambda
        Collections.sort(list, (w1, w2) -> Integer.compare(w1.length(), w2.length()));
        Collections.sort(list, comparingInt(String::length));
    }
}
