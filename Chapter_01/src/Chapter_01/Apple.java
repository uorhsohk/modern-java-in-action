package Chapter_01;

import static Chapter_01.COLOR.GREEN;

public class Apple {

    private final COLOR COLOR;

    private final int weight;

    public Apple(COLOR COLOR, int weight) {
        this.COLOR = COLOR;
        this.weight = weight;
    }

    public COLOR getColor() {
        return COLOR;
    }

    public int getWeight() {
        return weight;
    }

    public static boolean isGreenApple(Apple apple) {
        return GREEN.equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 100;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "COLOR=" + COLOR +
                ", weight=" + weight +
                '}';
    }
}
