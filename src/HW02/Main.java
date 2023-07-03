package HW02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        Number number01 = new Number();
        number01.requestNum(iScanner);

        System.out.println("-----------------------------");

        Division num = new Division();
        num.division(iScanner);

        System.out.println("-----------------------------");

        ThreeNumbers threeNumbers = new ThreeNumbers();
        threeNumbers.checkThreeNumbers(iScanner);
        
        iScanner.close();
    }
}
