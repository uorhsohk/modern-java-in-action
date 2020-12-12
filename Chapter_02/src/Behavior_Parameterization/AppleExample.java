package Behavior_Parameterization;

import java.util.ArrayList;
import java.util.List;

import static Behavior_Parameterization.Color.*;

public class AppleExample {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(GREEN, 150));
        inventory.add(new Apple(RED, 200));
        inventory.add(new Apple(GREEN, 90));

        System.out.println(filterApplesBasedOn(inventory, new AppleGreenColorPredicate()));
        prettyPrintApple(inventory, new PrettyPrintWeight());
        prettyPrintApple(inventory, new PrettyPrintColor());

    }

    public static List<Apple> filterApplesBasedOn(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void prettyPrintApple(List<Apple> inventory, PrettyPrintPredicate predicate) {
        StringBuilder builder = new StringBuilder();
        for (Apple apple : inventory) {
            builder.append(predicate.printWeight(apple));
            builder.append("\n");
        }
        System.out.println(builder);
    }
}
