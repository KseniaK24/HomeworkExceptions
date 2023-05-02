//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        task4();
    }
    public static void task4(){
        int d = 0;
        while (d==0) {
            try {
                System.out.println("Введите данные: ");
                Scanner scan = new Scanner(System.in);
                String str = scan.nextLine();
                if (str.isBlank()) {
                    throw new RuntimeException();
                }
                d = 1;
            } catch (RuntimeException e ){
                System.out.println("Пустые строки вводить нельзя");
            }
        }
    }
}
