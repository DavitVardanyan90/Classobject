import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

        int arr[] = {12, 25, 36, 85, 4, 6, 9,};              //3
        int indexPosition = 2;
        int newNUm = 11;
        System.out.println("arr " + Arrays.toString(arr));

        for (int i = arr.length - 1; i > indexPosition; i--) {
            arr[i] = arr[i - 1];
        }
        arr[indexPosition] = newNUm;
        System.out.println("indexPosition " + Arrays.toString(arr));



      //  int arr1[] = {15, 25, 36, 52, 41, 5, 6, 89};           //4
//        int max = arr1[0];
//        int min = arr1[0];
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] > max) {
//                max = arr1[i];
//            }
//            if (arr1[i] < min) {
//                min = arr1[i];
//            }
//
//        }
//        System.out.println("max is " + max);
//        System.out.println("min is " + min);

    }
}
