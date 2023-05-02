//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает
// введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
// необходимо повторно запросить у пользователя ввод данных.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1(){
        int d = 0;
        while (d==0) {
            try {
                System.out.println("Введите дробное число: ");
                Scanner scan = new Scanner(System.in);
                float num = scan.nextFloat();
                System.out.println(num);
                d = 1;
            } catch (InputMismatchException e) {
                System.out.println("Неверный ввод, попробуйте еще");

            }
        }
    }
}
