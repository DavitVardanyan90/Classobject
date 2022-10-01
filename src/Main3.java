public class Main3 {
    public static void main(String[] args) {

        int[] elements  = {8 , 2 , 10 , 3, 15 };            //8
        int firstSmall = elements[0];
        int secondSmall = elements[0];

        for (int i = 0; i < elements.length; i++)
        {
            for (int j = 0; j < elements.length; j++)
            {
                if (elements[i] < firstSmall)
                {
                    firstSmall = elements[i];

                    if (elements[j] < secondSmall)
                    {
                        secondSmall = elements[j];
                    }
                }
            }

        }

        System.out.println("The  first small element is: " + firstSmall + "\n"+  "The second small element is: " + secondSmall);

//        int arr[] = {1, -2, 5, -4, 3, -6};                         //9
//        for (int i = 0; i < args.length; i++) {
//            if (arr[i - 1] > 0 && arr[i] > 0) {
//                System.out.println(false);
//
//            } else if (arr[i - 1] < 0 && arr[i] < 0) {
//                System.out.println(false);
//
//            }
//        }
//
//        System.out.println(true);

    }
}
