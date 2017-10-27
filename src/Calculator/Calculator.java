package Calculator;

public class Calculator {

    public double Add(double firstArgument, double secondArgument){
    return firstArgument + secondArgument;
    }

    public double Substract(double firstArgument, double secondArgument){
        return firstArgument - secondArgument;
    }

    public double Multiply(double firstArgument, double secondArgument){
        return firstArgument * secondArgument;
    }

    public double Divide(double firstArgument, double secondArgument){
        return firstArgument / secondArgument;
    }

    public double Power(double firstArgument, double secondArgument){
        return Math.pow(firstArgument,secondArgument);
    }
}