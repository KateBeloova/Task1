package Calculator;

import Calculator.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Welcome to the calculator!\nType the 1 argument:");
            double a = Double.parseDouble(input.next());
            System.out.println("Type the 2 argument:");
            double b = Double.parseDouble(input.next());
            System.out.println("Choose operation (+, -, *, /, ^, %):");
            String str = input.next();
            switch (str){
                case "+": System.out.println(calc.Add(a,b));
                break;
                case "-": System.out.println(calc.Substract(a,b));
                break;
                case "*": System.out.println(calc.Multiply(a,b));
                break;
                case "/": System.out.println(calc.Divide(a,b));
                break;
                case "^": System.out.println(calc.Power(a,b));
                break;
            }
        }
    }
}
