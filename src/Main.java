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
        int[] namesOne = new int[3];
        namesOne[0] = 1;
        namesOne[1] = 2;
        namesOne[2] = 3;

        double[] numbersTwo = {1.57, 7.654, 9.986};

        double[] numbersThree = {4.8, 15.16, 23.42};

        System.out.println();

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] numbersOne = new int[3];
        numbersOne[0] = 1;
        numbersOne[1] = 2;
        numbersOne[2] = 3;
        for (int i = 0; i < numbersOne.length; i++) {
            System.out.print(numbersOne[i]);
            if (i != numbersOne.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] numbersTwo = {1.57, 7.654, 9.986};
        for (int i = 0; i < numbersTwo.length; i++) {
            System.out.print(numbersTwo[i]);
            if (i != numbersTwo.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        double[] numbersThree = {4.8, 15.16, 23.42};
        for (int i = 0; i < numbersThree.length; i++) {
            System.out.print(numbersThree[i]);
            if (i != numbersThree.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] numbersOne = new int[3];
        numbersOne[0] = 1;
        numbersOne[1] = 2;
        numbersOne[2] = 3;
        for (int i = numbersOne.length - 1; i >= 0; i--) {
            System.out.print(numbersOne[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        double[] numbersTwo = {1.57, 7.654, 9.986};
        for (int i = numbersTwo.length - 1; i >= 0; i--) {
            System.out.print(numbersTwo[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();

        double[] numbersThree = {4.8, 15.16, 23.42};
        for (int i = numbersThree.length - 1; i >= 0; i--) {
            System.out.print(numbersThree[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] namesOne = new int[3];
        namesOne[0] = 1;
        namesOne[1] = 2;
        namesOne[2] = 3;
        for (int i = 0; i < namesOne.length; i++) {
            if (namesOne[i] % 2 != 0) {
                namesOne[i] += 1;
            }
        }
        System.out.println(Arrays.toString(namesOne));
    }
}









