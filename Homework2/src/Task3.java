//Дан следующий код, исправьте его там, где требуется
// (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
public class Task3 {
    public static void main(String[] args) {
        try{
            int a = 90;
            int b = 3;
            System.out.println(a/b);
            printSum(23,234);
            int [] abc = {1,2};
            abc[3] = 3;
        }
        catch (ArithmeticException e ){
            System.out.println("На 0 делить нельзя");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Индекс выходит за пределы массива");
        }
        catch (Exception e){
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum( int a, int b) {
        System.out.println(a+b);
    }
}
