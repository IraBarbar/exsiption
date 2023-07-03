package HW03.Calculator;

import HW03.InvalidInputException;

public class Division implements Calculator {
    public Division(double num1, double num2) {
        action( num1,  num2);
    }
    @Override
    public void action(double num1, double num2) {
        try {
            division(num2);
            double res = num1 / num2;
            System.out.println(String.format(num1 + " / " + num2 + " = " + "%.2f", res));
        } catch (InvalidInputException e) {
            System.out.println("Ошибка. " + e.getMessage());
        }

    }
    private boolean division (double s2) throws InvalidInputException {
        if (s2 == 0) {
            throw new InvalidInputException("Делить на ноль нельзя!");
        }
        return true;
    }
}
