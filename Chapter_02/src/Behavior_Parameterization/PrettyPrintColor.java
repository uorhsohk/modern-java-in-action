package Behavior_Parameterization;

public class PrettyPrintColor implements PrettyPrintPredicate {
    @Override
    public String printBasedOnProperty(Apple apple) {
        return String.valueOf(apple.getColor());
    }
}
