package calculator;

public class Main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        View view = new View();
        Controller controller = new Controller(model,view);

//        double num1 = 10;
//        double num2 = 0;
//
//        char operator = '/';

        controller.calculate();
    }
}
