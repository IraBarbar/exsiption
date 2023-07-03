package HW02;

import java.util.Scanner;

public class ThreeNumbers {
    private int one;
    private int two;
    private int three;

    public ThreeNumbers(){
        this.one = one;
        this.two = two;
        this.three = three;
    }
    private boolean check(String s1, String s2, String s3) throws MyException {
        if (Integer.parseInt(s1) > 100 )
            throw new MyException ("Первое число вне допустимого диапазона!");
        if (Integer.parseInt(s2) < 0 )
            throw new MyException ("Второе число вне допустимого диапазона!");
        if ((Integer.parseInt(s2) + Integer.parseInt(s1)) < 10 )
            throw new MyException ("Сумма первого и второго чисел слишком мала!");
        if (Integer.parseInt(s3)  == 0 )
            throw new MyException ("Деление на ноль недопустимо!");
        return true;
    }

    public void checkThreeNumbers(Scanner iScanner){
        boolean inputNum = false;
        Number.question();
        String val01 = iScanner.next();
        Number.question();
        String val02 = iScanner.next();
        Number.question();
        String val03 = iScanner.next();
        try {
            inputNum = check(val01, val02, val03);
            System.out.println("Проверка пройдена успешно!");

        } catch (MyException e) {
            System.out.println("Ошибка. " + e.getMessage());
        }
    }
}
