package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        displayAllElements(array);
        displayAllElementsReverse(array);
        displayAllBiggerThree(array);
        displayAllPairs(array, true);
        displayAllPairIndex(array);
        displayAllPairs(array, false);


    }


    public static void displayAllElements(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }

    public static void displayAllElementsReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static void displayAllBiggerThree(int[] array) {
        for (int number : array) {
            if (number > 3)
                System.out.println(number);
        }
    }

    public static void displayAllPairs(int[] array, boolean pair) {
        for (int number : array) {
            if (pair && number % 2 == 0)
                System.out.println(number);
            else if (!pair && number % 2 != 0)
                System.out.println(number);
        }
    }

    public static void displayAllPairIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i%2 == 0)
                System.out.println(array[i]);
        }
    }
}
