package Chapter_01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static Chapter_01.COLOR.GREEN;
import static Chapter_01.COLOR.RED;
import static java.util.stream.Collectors.toList;

public class AppleExample {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(RED, 150));
        apples.add(new Apple(GREEN, 100));
        apples.add(new Apple(GREEN, 25));

        System.out.println(filterGreenApples(apples));

        // using method reference
        System.out.println(filterApples(apples, Apple::isGreenApple));
        System.out.println(filterApples(apples, Apple::isHeavyApple));

        // using lambda
        System.out.println(filterApples(apples, (Apple a) -> GREEN.equals(a.getColor())));
        System.out.println(filterApples(apples, (Apple a) -> a.getWeight() > 100));

        // using Stream API
        List<Apple> heavyApples = apples.stream()
                .filter((Apple a) -> a.getWeight() > 100)
                .collect(toList());
        System.out.println(heavyApples);

        // using parallel processing
        List<Apple> heavyApplesUsingParallelProcessing = apples.parallelStream()
                .filter((Apple a) -> a.getWeight() > 100)
                .collect(toList());
        System.out.println(heavyApplesUsingParallelProcessing);


    }

    public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterGreenApples(List<Apple> apples) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }
}
