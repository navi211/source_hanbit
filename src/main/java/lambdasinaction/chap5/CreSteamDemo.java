package lambdasinaction.chap5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreSteamDemo {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("aaaa");
        strings.add("vvvv");
        strings.add("cccc");
        strings.add("wwww");


        Stream<String> a  = strings.stream();

        int[] intArray = {1,2,4,5,6,7};

        IntStream intStream = IntStream.of(intArray);

        IntStream intRange = IntStream.range(1,10000000);

        IntStream intRangeClose = IntStream.rangeClosed(1,100);


        long sum = LongStream.range(1,10000000)
                .map(item -> item * item)
                //.skip(10000000 - 100) //마지막100개만
                //.forEach(item -> {
                //    System.out.println(item);
                //});
                .sum();

        System.out.println(intRange);


        //랜덤넘버 제너레이터
        Random random = new Random();

        random.ints()
                .map(item->Math.abs(item) % 6 + 1)
                //.limit(30)
                .forEach(System.out::println);







    }


}
