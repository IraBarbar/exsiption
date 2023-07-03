package HW02;

import java.util.Scanner;

public class Number {
    private int num;

    public Number(){
        this.num = num;
    }

    public static void question (){
        System.out.println("Введите число: ");
    }


    public void requestNum(Scanner iScanner ){
        boolean validInput = false;
        question();
        String val = iScanner.next()  ;
        try {
             validInput =  isDigit(val) ;
             System.out.println("Число корректно.");
             num = Integer.parseInt(val);
             printNum();
        } catch (MyException e) {
            System.out.println("Ошибка. " + e.getMessage());
        }
        finally {

        }
    }

    public int getNum(){
        return num;
    }
    public void printNum(){
        System.out.println(getNum());
    }
    private boolean isDigit(String s) throws MyException {
        if (Integer.parseInt(s) <= 0 )
            throw new MyException ("Некорректное число!");
        return true;
    }
}
