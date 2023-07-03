package HW03.Calculator;

public class Minus implements Calculator{
    public Minus(double num1, double num2) {
        action( num1,  num2);
    }
    @Override
    public void action(double num1, double num2) {
        double res = num1 - num2;
        System.out.println(String.format(num1 + " - " + num2 + " = " + "%.2f", res));
    }
}
