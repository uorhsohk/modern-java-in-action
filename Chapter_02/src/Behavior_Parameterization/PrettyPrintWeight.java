package Behavior_Parameterization;

public class PrettyPrintWeight implements PrettyPrintPredicate {
    @Override
    public String printWeight(Apple apple) {
        return String.valueOf(apple.getWeight());
    }
}
