//2. Если необходимо, исправьте данный код
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

public class Task2 {
    public static void main(String[] args) {
       task2();
    }
    public static void task2(){
        try{
            int [] intArray = {1,2,3};
            int d = 0;
            double catchedRes1 = (double) intArray[8]/d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e ) {
            System.out.println("Catchin exception: " + e);
        }
    }
}
