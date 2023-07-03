package HW03.Calculator;

import HW03.InvalidInputException;

import java.util.Scanner;

public  class Data {

    double num1;
    double num2;
    boolean inputNum = false;
    String symbol;

    View question = new View();
    Scanner scanner = new Scanner(System.in);




    public void inputNumber1 () {
        while (!inputNum) {
            question.writeNumber();
            String val = scanner.next();
            try {
                inputNum = check(val);
                num1 = Double.parseDouble(val);

            } catch (HW03.InvalidInputException e) {
                System.out.println("Ошибка. " + e.getMessage());
            }
        }
        inputNum = false;
    }
    public void inputNumber2 () {
        while (!inputNum) {
            question.writeNumber();
            String val2 = scanner.next();
            try {
                inputNum = check(val2);
                num2 = Double.parseDouble(val2);
            } catch (HW03.InvalidInputException e) {
                System.out.println("Ошибка. " + e.getMessage());
            }
        }
        inputNum = false;
    }
    public String inputSymbol() {
        while (!inputNum) {
            question.writeSymbol();
            symbol = scanner.next();
            try {
                inputNum = checkSymbol(symbol);
            } catch (InvalidInputException e) {
                System.out.println("Ошибка. " + e.getMessage());
            }
        }
        inputNum = false;
        return symbol;
    }
    public void closeScanner(){
        scanner.close();
    }





    private boolean checkSymbol (String  symbol) throws InvalidInputException {
        if (!symbol.matches(".*[/*+-].*")) {
            throw new InvalidInputException("Некорректный символ!");
        }
        return true;
    }
    private boolean check(String s1) throws InvalidInputException {
        if (!s1.matches(".*\\d.*")) {
            throw new InvalidInputException("Некорректное число!");
        }
        return true;
    }
}
