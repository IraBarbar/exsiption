package HW03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PowerCalculator calc = new PowerCalculator();
        calc. calculatePower(scanner);

        scanner.close();
    }

}
