package HomeWork3;


public class HomeWorkApp3 {

    public static void main(String[] args) {



        //Задание 1.
        int[] masArr = {1, 1, 0, 1, 0, 0, 1};
        for (int i = 0; i < masArr.length; i++) {
            if (masArr[i] == 1) {
                System.out.print("0");

            } else {
                System.out.print("1");
            }

        }
        System.out.println();

        //Задание 2.
        int[] countArr = new int[100];
        for (int i = 0; i < countArr.length; i++) {
            countArr[i] = i;
            {
                System.out.print(countArr[i] + 1 + " ");
            }

        }
        System.out.println();


        //Задание 3.

        int[] newArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] < 6) {
                System.out.print(newArr[i] * 2 + " ");
            } else {
                System.out.print(newArr[i] + " ");
            }
        }
        System.out.println();
        //Задание 4.
        int[][] diagArr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                diagArr[i][i] = 1;
                diagArr[i][diagArr.length - 1 - i] = 1;

                System.out.print(diagArr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        //Задание 5.
        int[] printArr1 = returnArr(5,22);
        printArr(printArr1);
    }


    public static int[] returnArr(int len, int initValue) {
        int[] retArr = new int[len];
        for (int i = 0; i < retArr.length; i++) {
            retArr[i] = initValue;
        }
        return retArr;
    }




    public static void printArr(int[] inp) {
        for (int i = 0; i < inp.length; i++)
        {
            System.out.print(inp[i] + " ");
    }
   System.out.println();
}
}






















