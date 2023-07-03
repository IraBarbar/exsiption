package HW02;

import java.util.Scanner;

public class Division {
    private int num01;
    private int num02;

    public Division (){
        this.num01 = num01;
        this.num02 = num02;
    }
    private boolean num02NotZero(String s) throws MyException{
        if (Integer.parseInt(s) == 0)
            throw new MyException("Деление на ноль недопустимо!");
        return true;
    }

    private boolean isDigit(String s1, String s2) throws MyException {
        if (!s1.matches(".*\\d.*")) {
            throw new MyException("Некорректное число!");
        }
        if (!s2.matches(".*\\d.*")) {
            throw new MyException("Некорректное число!");
        }
        return true;
    }

    public void division(Scanner scanner){
        boolean inputNum = false;
        Number.question();
        String val01 = scanner.next();
        Number.question();
        String val02 = scanner.next();
        try {
            inputNum = isDigit(val01, val02);
            num01 = Integer.parseInt(val01);
            try {
                num02 = Integer.parseInt(val02);
                num02NotZero(val02);
                float res = (float) num01/num02;
                System.out.println(String.format(num01 + " / " + num02 + " = " + "%.2f",res ) );
            }  catch (MyException ex){
                System.out.println("Ошибка. " + ex.getMessage());
            }
        } catch (MyException e) {
            System.out.println("Ошибка. " + e.getMessage());
        }
        finally {

        }
    }


}
