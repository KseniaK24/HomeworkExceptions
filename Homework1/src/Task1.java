//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class Task1 {
    public static void main(String[] args) {
       System.out.println(div(8,0));
       int [] arr = {1,2,3,4};
       System.out.println(valueArray(arr,10));
       System.out.println(digital("k"));
    }
    public static int div( int a, int b){
        return a/b;
    }
    public static int valueArray( int [] arr, int index){
        return arr[index];
    }
    public static int digital (String s){
        return Integer.parseInt(s);
    }
}
