package Behavior_Parameterization;

public class PrettyPrintWeight implements PrettyPrintPredicate {
    @Override
    public String printBasedOnProperty(Apple apple) {
        return String.valueOf(apple.getWeight());
    }
}
