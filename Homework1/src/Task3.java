//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий
// новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.
public class Task3 {
    public static void main(String[] args) {
        int [] arrA = {1,2,3};
        int [] arrB = {10,20,30,40};
        printArr(arrayDifference(arrA,arrB));

    }
    public static int [] arrayDifference(int [] arrA, int [] arrB){
        if (arrA.length != arrB.length){
            throw new RuntimeException("Длинны массивов не равны");
        }
        int [] result = new int[arrA.length];
        for (int i=0; i<arrA.length; i++){
            result[i] = arrA[i] - arrB[i];
        }
        return result;
    }
    public static void printArr(int [] arr){
        for (int n:arr){
            System.out.println(n);
        }
    }
}
