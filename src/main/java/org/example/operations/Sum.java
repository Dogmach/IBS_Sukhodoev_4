public class Sum implements MathOperations {

    @Override
    public double result(double a, double b) {
        return a + b;
    }

    public Sum() {
        System.out.println("Рассчёт произведен успешно.");
    }
}
