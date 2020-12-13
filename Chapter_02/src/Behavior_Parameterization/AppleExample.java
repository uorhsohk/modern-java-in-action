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

        // using lambdas
        System.out.println(filterApplesBasedOn(inventory, (Apple a) -> a.getColor().equals(RED)));

        // sorting using lambdas
        List<Apple> sortInventoryByWeight = new ArrayList<>(inventory);
        sortInventoryByWeight.sort((Apple a1, Apple a2) -> Integer.compare(a1.getWeight(), a2.getWeight()));
        System.out.println(sortInventoryByWeight);

        List<Apple> sortInventoryByColor = new ArrayList<>(inventory);
        sortInventoryByColor.sort((Apple a1, Apple a2) -> a1.getColor().compareTo(a2.getColor()));
        System.out.println(sortInventoryByColor);

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
            builder.append(predicate.printBasedOnProperty(apple));
            builder.append("\n");
        }
        System.out.println(builder);
    }
}
