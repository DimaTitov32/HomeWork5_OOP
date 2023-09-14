package calculator;

public class Controller {
    private CalculatorModel model;
    private  View view;

    public Controller(CalculatorModel model, View view){
        this.model = model;
        this.view = view;
    }

    public double userInputOne(){
        return view.inputOne();
    }

    public double userInputTwo(){
        return view.inputTwo();
    }

    public String inputOp(){
        return view.inputOperator();
}
    

    public void calculate(){
        double result;
        try {
            switch (inputOp()){
                case "+":
                    result = model.add(userInputOne(),userInputTwo());
                    break;
                case "-":
                    result = model.subtrack(userInputOne(),userInputTwo());
                    break;
                case "*":
                    result = model.multyply(userInputOne(),userInputTwo());
                    break;
                case "/":
                    result = model.divide(userInputOne(),userInputTwo());
                    break;
                default:
                    view.printError("Неверная операция");
                        return;
            }
            view.printResult(result);
        } catch (ArithmeticException e){
            view.printError(e.getMessage());
//            calculate(num1,num2,operator); возмоожный пример повторного вызова
        }
    }
}
