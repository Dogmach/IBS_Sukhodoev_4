public class Subtract implements MathOperations {

    @Override
    public double result(double a, double b) {
        return a - b;
    }

    public Subtract() {
        System.out.println("Рассчёт произведен успешно.");
    }
}