import java.util.Scanner;

public class Main {

    public static void calculate(Calculating calc){
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double b = scanner.nextDouble();

        System.out.println("Введите действие для калькулятора: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        int errorCode = calc.result(a,b,action);

        if (errorCode == Calculating.ERROR_no){
            System.out.printf("Ответ: " + a + " "+ action + " " +   b + " = %.4f", calc.getValue());
        }
        else {
            System.err.println("ОШИБКА: " + calc.getErrorText(errorCode));
        }
        scanner.close();
    }
    public static void main(String[] args) {
        Calculating calculating = new Calculating();
        calculate(calculating);
    }
}