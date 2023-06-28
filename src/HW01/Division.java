package HW01;

public class Division {
    int num1;
    int num2;

    public Division(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    private float division() {
        float res = (float)(this.num1 / this.num2);
        return res;
    }

    public void divisionPrintIf() {
        if (this.num2 != 0) {
            System.out.printf("%d / %d = %.2f \n", this.num1, this.num2, this.division());
        } else {
            System.out.println("На ноль делить нельзя!");
        }

    }

    public void divisionPrintExs() {
        try {
            System.out.printf("%d / %d = %.2f \n", this.num1, this.num2, this.division());
        } catch (ArithmeticException var2) {
            System.out.println("Деление на ноль недопустимо!");
        }

    }
}
