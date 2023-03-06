import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
//      Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        int[] numbers1 = new int[]{1, 2, 3};
//      Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        float[] numbers2 = {1.57F, 7.654F, 9.986F};
//      Произвольный массив
        int[] numbers3 = new int[3];
        numbers3[0] = 9;
        numbers3[1] = 7;
        numbers3[2] = 6;
    }

    public static void task2() {
        System.out.println("Задача 2");
//     Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
//     В конце строки запятую ставить не надо.

        int[] numbers1 = {1, 2, 3};
        for (int i = 0; i < numbers1.length; i++) { // numbers1.length = 3
            System.out.print(numbers1[i]);
            if (i < numbers1.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        float[] numbers2 = {1.57F, 7.654F, 9.986F};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i]);
            if (i < numbers2.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        int[] numbers3 = {9, 7, 6};
        for (int i = 0; i < numbers3.length; i++) {
            System.out.print(numbers3[i]);
            if (i < numbers3.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
//          Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
//          В конце строки запятую ставить не надо.

        int[] numbers1 = new int[] {1, 2, 3};
        for (int i = numbers1.length - 1; i >= 0; i -= 1) {
            System.out.print(numbers1[i]);
            if(i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        float[] numbers2 = {1.57F, 7.654F, 9.986F};
        for (int i = numbers2.length -1; i >= 0; i -= 1) {
            System.out.print(numbers2[i]);
            if(i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        int[] numbers3 = {9, 7, 6};
        for (int i = numbers3.length - 1; i >= 0; i -= 1) {
            System.out.print(numbers3[i]);
            if(i > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
//     Пройдитесь по первому целочисленному массиву
//     и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        int[] numbers1 = new int[] {1, 2, 3};
        for (int i = 0; i < numbers1.length; i++) {
            if(numbers1[i] % 2 == 1) {
                numbers1[i] ++;
            }
            System.out.println(numbers1[i]);
        }

        // если формат не важен
        for (int i = 0; i < numbers1.length; i++) {
            if(numbers1[i] % 2 == 1) {
                numbers1[i] ++;
            }
        }
        System.out.println(Arrays.toString(numbers1));
    }
}