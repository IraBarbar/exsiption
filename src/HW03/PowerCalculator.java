package HW03;
import HW02.Number;

import java.util.Scanner;

public class PowerCalculator {
    double num1;
    double num2;
    double res;

    public PowerCalculator(){
    }
    private void writeSymbol(){
        System.out.println("Введите символ (степень -- **): ");
    }
    public void calculatePower(Scanner scanner){
        boolean inputNum = false;
        Number.question();
        String val1 = scanner.next();
        writeSymbol();
        String symbol = scanner.next();
        Number.question();
        String val2 = scanner.next();
        try {
            checkSymbol(symbol);
            try {
                inputNum = check(val1, val2);
                num1 = Integer.parseInt(val1);
                num2 = Integer.parseInt(val2);

                switch (symbol) {
                    case ("+"): {
                        res = num1 + num2;
                        System.out.println(String.format(num1 + " + " + num2 + " = " + "%.2f", res));
                        break;
                    }
                    case ("-"): {
                        res = num1 - num2;
                        System.out.println(String.format(num1 + " - " + num2 + " = " + "%.2f", res));
                        break;
                    }
                    case ("*"): {
                        res = num1 * num2;
                        System.out.println(String.format(num1 + " * " + num2 + " = " + "%.2f", res));
                        break;
                    }
                    case ("/"): {
                        try {
                            division(num2);
                            res = num1 / num2;
                            System.out.println(String.format(num1 + " / " + num2 + " = " + "%.2f", res));
                        } catch (MyException e) {
                            System.out.println("Ошибка. " + e.getMessage());
                        }
                        finally {
                            break;
                        }
                    }
                    case ("**"): {
                        try {
                            pow(num2);
                            res = Math.pow(num1, num2);
                            System.out.println(String.format(num1 + " ** " + num2 + " = " + "%.2f", res));
                        } catch (MyException e) {
                            System.out.println("Ошибка. " + e.getMessage());
                        }
                        finally {
                            break;
                        }
                    }

                }
            } catch (MyException e) {
                System.out.println("Ошибка. " + e.getMessage());
            }
        }catch (MyException ex){
            System.out.println("Ошибка. " + ex.getMessage());
        }
    }
    private boolean check(String s1,String s2) throws MyException{
        if (!s1.matches(".*\\d.*")) {
            throw new MyException("Некорректное число!");
        }
        if (!s2.matches(".*\\d.*")) {
            throw new MyException("Некорректное число!");
        }
        return true;
    }
    private boolean division (double s2) throws MyException{
        if (s2 == 0) {
            throw new MyException("Делить на ноль нельзя!");
        }
        return true;
    }
    private boolean pow (double s2) throws MyException{
        if (s2 <= 0) {
            throw new MyException("Степень не может быть ноль или меньше нуля!");
        }
        return true;
    }
    private boolean checkSymbol (String  symbol) throws MyException{
        if (!symbol.matches(".*[/*+-].*")) {
            throw new MyException("Некорректный символ!");
        }
        return true;
    }

}
