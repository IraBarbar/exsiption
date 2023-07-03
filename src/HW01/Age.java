package HW01;

import java.util.Scanner;

public class Age {
    Integer age;

    public Age(){
        this.age = age;
    }
    private void ask(){
        System.out.println("Введите ваш возраст : ");
    }
    private Integer pars(String value ){
         return Integer.parseInt(value);
    }

    private Integer userAge(){
        Scanner scanner = new Scanner(System.in);
        String val = scanner.next() ;
        age = pars(val);
        scanner.close();
        return age;
    }

    public void printAge(){
        try {
            ask() ;
            userAge();
            System.out.println("Возраст пользователя : " + age);
        }   catch (NumberFormatException e) {
                System.out.println("Ошибка! Некорректный ввод.");
        }
    }
}
