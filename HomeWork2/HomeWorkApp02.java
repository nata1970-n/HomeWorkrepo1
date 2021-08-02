package HomeWork2;

public class HomeWorkApp02 {

    public static void main(String[] args) {

        if (summInt(8, 10)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (polInt(0)) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
        if (numberInt(-50)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        numberSt("Привет", 3);



    }

    // Задание 1:
    public static boolean summInt(int a, int b) {
        return ((a + b) >= 10 && (a + b) <= 20);
    }


    // Задание 2:
    public static boolean polInt(int a) {
        return (a < 0);
    }

    //Задание 3:
    public static boolean numberInt(int a) {
        return (a < 0);
    }

    //Задание 4:
    public static void numberSt(String word, int a) {
        for (int i = 0; i <= a - 1; i++) {
            System.out.println("Привет");
        }
    }


    }


















