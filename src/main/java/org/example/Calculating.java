public class Calculating {
    public static final int ERROR_no = 0;
    public static final int ERROR_not_sup = 1;
    public static final int ERROR_zero = 2;

    private double val = 0.0;

    public double getValue() {
        return val;
    }

    public int result(double a, double b, String actions){
        if (actions.length() != 1){
            return ERROR_not_sup;
        }
        MathOperations example;
        switch (actions.charAt(0)){
            case '+':
                example = new Sum();
                val = example.result(a,b);
                return ERROR_no;
            case '-':
                example = new Subtract();
                val = example.result(a,b);
                return ERROR_no;
            case '*':
                example = new Multiply();
                val = example.result(a,b);
                return ERROR_no;
            case '/':
                example = new Divide();
                val = example.result(a,b);
                if (b == 0){
                    return ERROR_zero;
                }
                return ERROR_no;
        }
        return ERROR_not_sup;
    }

    public String getErrorText(int errorCode){
        switch (errorCode){
            case ERROR_no -> {
                return "";
            }
            case ERROR_not_sup -> {
                return "Необходимо ввести один из знаков: +, -, * или /.";
            }
            case ERROR_zero -> {
                return "Делить на ноль нельзя!";
            }
        }
        return "Ошибка. Обратитесь к разработчику.";
    }
}
