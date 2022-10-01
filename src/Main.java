import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] arr = {10, 15, 6, 17, 25};       // 1

        for (int i = 0; i < arr.length; i++) {

        }

        int chengnum = 15;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == chengnum) {
                arr[i] = 8;
            }
            System.out.println(arr[i]);
        }

//
//        int[] mas = {15, 25, 63, 18, 98, 36, 18};                  // 2
//        int[] copymas = new int[7];
//
//
//        for (int i = 0; i < mas.length; i++) {
//            System.out.print(mas[i] + " ");
//
//            copymas[i] = mas[i];
//            System.out.println(copymas[i]);
//        }
/////  kam
//
//        int[] my_array = {15, 25, 63, 18, 98, 36, 18};
//        int[] new_array = new int[7];
//
//        System.out.println("Source Array : " + Arrays.toString(my_array));
//
//        for (int i = 0; i < my_array.length; i++) {
//            new_array[i] = my_array[i];
//        }
//        System.out.println("New Array: " + Arrays.toString(new_array));

    }
}