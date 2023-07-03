package HW03;

import java.util.Scanner;

public class Transaction {
    float transaction;
    boolean checkSum;
    View question = new View();
    Client clientFrom;
    Client clientTo;
    Scanner scanner;
    public Transaction(Scanner scanner, Client clientFrom, Client clientTo){

        this.scanner = scanner;
        this.clientFrom = clientFrom;
        this.clientTo = clientTo;
        transaction();
    }



    public void transaction( ){
          question.enterAmount();
          String val =  scanner.next();
          try {
              checkSum = isDigital(val);
              transaction = Float.parseFloat(val);
              try {
                  checkSum = checkSumLessZero(transaction);
                  try {
                      checkSum = checkSumMoreBalans(transaction);
                      clientFrom.setBalans(-transaction);
                      clientTo.setBalans(transaction);

                      
                  } catch (InvalidInputException e) {
                      System.out.println("Ошибка." + e.getMessage());
                  }

              } catch (InvalidInputException e) {
                  System.out.println("Ошибка. " + e.getMessage());
              }

          } catch (InvalidInputException e) {
              System.out.println("Ошибка. " + e.getMessage());
          }
          finally {
              System.out.println("Счет номер " + clientFrom.getNameCheck() + " остаток на балансе: " + clientFrom.getBalans() );
              System.out.println("Счет номер " + clientTo.getNameCheck() + " остаток на балансе: " + clientTo.getBalans() );
          }

    }


    private boolean checkSumLessZero(float transaction) throws InvalidInputException {
        if (transaction < 0 )
            throw new InvalidInputException("Сумма мешьше ноля.")  ;
        return true;
    }
    private boolean  checkSumMoreBalans ( float transaction) throws InvalidInputException {
       if (transaction > clientFrom.getBalans())
           throw new InvalidInputException("Сумма привышает баланс.") ;
       return true;
    }

    private boolean isDigital(String s1) throws InvalidInputException {
        if (!s1.matches(".*\\d.*")) {
            throw new InvalidInputException("Некорректное число!");
        }
        return true;
    }

}
