package Behavior_Parameterization;

public class PrettyPrintColor implements PrettyPrintPredicate {
    @Override
    public String printBasedOnProperty(Apple apple) {
        return "Apple with weight of: " + apple.getWeight() + "g has the color: " + apple.getColor();
    }
}
