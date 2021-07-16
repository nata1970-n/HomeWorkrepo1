package Lesson01;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        chekSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void chekSumSign() {
        int a = -20;
        int b = 15;
         int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательная");
    }
    public static void printColor() {
        int val = -3;
        if (val <= 0) {
            System.out.println("Красный");
        } else if (val > 0 && val <= 100) {
            System.out.println("Желтый");
        } else if (val > 100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 23;
        int b = 3;
        if (a>b) {
            System.out.println("a>b");
        } else
            System.out.println("a<b" );

    }
}

