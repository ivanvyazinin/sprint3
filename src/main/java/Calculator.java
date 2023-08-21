public class Calculator {
    final static int MIN_AMOUNT = 400;

    public static int calculate(Integer distance, Boolean isLarge, Boolean isFragile) {
        int currentAmount = 0;

        if (distance > 10) currentAmount += 200;
        else if (distance > 2) currentAmount += 100;
        else currentAmount += 50;

        if (isLarge) currentAmount += 200;
        else currentAmount += 100;

        if (isFragile) currentAmount += 300;

        return Math.max(currentAmount, MIN_AMOUNT);
    }
}
