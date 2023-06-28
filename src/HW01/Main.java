package HW01;

import HW01.Age;
import HW01.Division;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Division t = new Division(6, 3);
        Division t2 = new Division(6, 0);

        System.out.println("If:");
        t.divisionPrintIf();
        t2.divisionPrintIf();

        System.out.println("-------------------------------");

        System.out.println("Исключение ArithmeticException:");
        t.divisionPrintExs();
        t2.divisionPrintExs();

        System.out.println("-------------------------------");

        Age user1 = new Age();
        user1.printAge();

        System.out.println("-------------------------------");
        ReadFile sum = new ReadFile();
        try {
            sum.read();
        } catch (IOException ex){
              System.out.println(ex);
        }

    }
}