public class Main4 {

    public static void main(String[] args) {


//        int arr[]={1,2,8,88,54,45,36,14};                        //11
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println( " arr " + "[" +  i  + "] " + " = " + arr[i]);
//
//        }
//
//        int arr[] = {12, 13, 25, 14, 3, 6, 5,};    //12
//        int specValue = 13;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == specValue) {
//                System.out.println(" array have a specific value");
//            }
//        }


//        int arr[] = {11, 13, 24, 5, 9, 8, 4};    //13
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);


        int arr[] = {11, 13, 24, 2, 9, 8, 24};   //14
        int sum = 0;
        int averegValue = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
            averegValue = sum / arr.length;
        }
        System.out.println(averegValue);
    }
}