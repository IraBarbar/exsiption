package Seminar2;


    import java.util.Scanner;

    /*
    Задача: Проверка правильности ввода пароля
    Напишите программу, которая запрашивает у пользователя пароль. Правила для пароля следующие:

    Длина пароля должна быть не менее 8 символов.
    Пароль должен содержать хотя бы одну заглавную букву.
    Пароль должен содержать хотя бы одну цифру.
    Пароль должен содержать хотя бы один специальный символ (!@#$%^&*).
    Если пользователь вводит неправильный пароль,
    программа должна выбрасывать исключение InvalidPasswordException с сообщением
    о причине ошибки. Необходимо обработать исключение и вывести соответствующее сообщение.
     */
    public class Task2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the password: ");
            String pass = scanner.nextLine();
            boolean valid = false;
            try {
                valid = check(pass);
            }catch (Exception ex){
                System.out.println("Error: " + ex.getMessage());
            }
            System.out.println("Password save is "+valid);

        }
        public static boolean check(String value) throws MyNewException {
            if (value.length()<8){
                throw new MyNewException("Less than 8 chars");
            }
            if (!value.matches(".*[A-Z].*")){
                throw new MyNewException("Password has no chars");
            }
            if (!value.matches(".*\\d.*")){
                throw new MyNewException("Password has no numbers");
            }
            if (!value.matches(".*[!@#$%^&*_].*")){
                throw new MyNewException("Password has no Symbols");
            }
            return true;
        }
    }
    class MyNewException extends Exception {
        public MyNewException(String mes){
            super(mes);
        }
    }

