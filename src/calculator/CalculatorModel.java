package calculator;

public class CalculatorModel {
//    Бизнес логика - Модель
    public double add(double num1, double num2){
        return num1 + num2;
    }

    public double subtrack(double num1,double num2){
        return  num1-num2;
    }

    public double multyply(double num1, double num2){
        return num1*num2;
    }

    public double divide(double num1, double num2){
        if(num2 == 0){
            throw new ArithmeticException("Нельзя делить на ноль!!!");
        }
        return num1/num2;
    }
}
