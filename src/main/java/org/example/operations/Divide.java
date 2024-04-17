public class Divide implements MathOperations {

    @Override
    public double result(double a, double b) {
        return a / b;
    }

    public Divide() {
        System.out.println("Рассчёт произведен успешно.");
    }
}
