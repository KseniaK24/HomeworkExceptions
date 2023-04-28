//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый
//массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода
//единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
public class Task4 {
    public static void main(String[] args) {
        int [] arrA = {1,2,3,4};
        int [] arrB = {10,20,0,40};
        printArr(arrayDivision(arrA,arrB));

    }
    public static double [] arrayDivision(int [] arrA, int [] arrB){
        if (arrA.length != arrB.length){
            throw new RuntimeException("Длинны массивов не равны");
        }
        double [] result = new double[arrA.length];
        for (int i=0; i<arrA.length; i++){
            if(arrB[i] ==0){
                throw new RuntimeException("Массив делителя содержит 0, на 0 делить нельзя");
            }
            result[i] = arrA[i] / (double)arrB[i];
        }
        return result;
    }
    public static void printArr(double [] arr){
        for (double n : arr){
            System.out.println(n);
        }
    }
}

