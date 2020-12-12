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
}
