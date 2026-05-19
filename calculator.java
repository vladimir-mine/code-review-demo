public class Calculator {

    public double add(double a, double b) { // 1111111
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b; // 22222222
    }

    public double calculateAverage(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty"); // 22131231231
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
}
