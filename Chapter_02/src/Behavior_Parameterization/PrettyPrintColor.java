package Behavior_Parameterization;

public class PrettyPrintColor implements PrettyPrintPredicate {
    @Override
    public String printWeight(Apple apple) {
        return String.valueOf(apple.getColor());
    }
}
