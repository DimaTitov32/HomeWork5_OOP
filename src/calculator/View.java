package calculator;

import java.util.Scanner;

public class View {

    public double inputOne(){
        System.out.println("Введите первое число");
        double num1 = 0;
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextDouble()){
            num1 = scanner.nextDouble();
        }else {
            throw new ArithmeticException("Введите число");
        }
        return num1;
    }
    public double inputTwo(){
        System.out.println("Введите второе число");
        double num2 = 0;
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextDouble()){
            num2 = scanner.nextDouble();
        }else {
            throw new ArithmeticException("Введите число");
        }
        return num2;
    }

    public String inputOperator(){
        Scanner scanner = new Scanner(System.in);
        String operator = "";
        System.out.println("Укажите операцию: + -  * /");
        if(scanner.hasNextLine()){
            operator = scanner.nextLine();
        }
        return operator;
    }

    public void printResult(double result){
        System.out.println("Результат: " + result);

    }

    public void printError(String errorMassage){
        System.out.println("Ошибка: " + errorMassage);
    }
}
