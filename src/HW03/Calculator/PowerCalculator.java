package HW03.Calculator;
import HW02.Number;
import HW03.InvalidInputException;

import java.util.Scanner;

public class PowerCalculator {
    Data data = new Data() ;

    public PowerCalculator(){
    }


    public void calculatePower(){
        data.inputNumber1();
        data.symbol = data.inputSymbol();
        data.inputNumber2();
        data.closeScanner();
            switch (data.symbol) {
                case ("+"): {
                    new Addition(data.num1, data.num2);
                    break;
                }
                case ("-"): {
                    new Minus(data.num1, data.num2);
                    break;
                }
                case ("*"): {
                   new Multiplication(data.num1, data.num2);
                   break;

                }
                case ("/"): {
                    new Division(data.num1, data.num2);
                    break;
                }
                case ("**"): {
                    new Degree(data.num1, data.num2);
                    break;
                }
            }
    }



}
