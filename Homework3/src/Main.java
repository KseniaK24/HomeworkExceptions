import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Data data = null;
        boolean error = true;
        while (error){
            boolean err = true;
            while (err) {
                System.out.println("Введите через пробел ФИО, дату рождения, номер телефона, пол(f или m)\n" +
                        "(Пример: Ivanov Ivan Ivanovich 20.05.1990 890012354 m)");
                Scanner scan = new Scanner(System.in);
                data = new Data(scan.nextLine());
                err = data.codesErr(data.checkQuantity());
            }
            try {
                data.setSurname();
                data.setName();
                data.setPatronymic();
                data.setDateOfBirth();
                data.setPhoneNumber();
                data.setSex();
                error = false;
            } catch (DataFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        try(FileWriter writer = new FileWriter(data.surname + ".txt",true)){
            String text = String.format("<%s><%s><%s><%s><%s><%s>\n",
                    data.surname, data.name, data.patronymic, data.dateOfBirth, data.phoneNumber, data.sex);
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Данные записаны");
    }
}