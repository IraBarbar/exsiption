package HW03.Calculator;

import HW03.InvalidInputException;

public class Degree implements Calculator {
    public Degree (double num1, double num2) {
        action( num1,  num2);
    }
    @Override
    public void action(double num1, double num2) {
        try {
            pow(num2);
            double res = Math.pow(num1, num2);
            System.out.println(String.format(num1 + " ** " + num2 + " = " + "%.2f", res));
        } catch (InvalidInputException e) {
            System.out.println("Ошибка. " + e.getMessage());
        }
    }

    private boolean pow (double s2) throws InvalidInputException {
        if (s2 <= 0) {
            throw new InvalidInputException("Степень не может быть ноль или меньше нуля!");
        }
        return true;
    }
}
