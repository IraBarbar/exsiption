package HW03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        PowerCalculator calc = new PowerCalculator();
//        calc.calculatePower(scanner);

        Client client1 = new Client();
        Client client2 = new Client();
        client1.setBalans(1000);

        Transaction op = new Transaction(scanner, client1, client2);



        scanner.close();
    }

}
