package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {
        showFromTo(1, 10);
        sayMyName(20);
        showPairsFromTo(true, 2, 100);
        showPairsFromTo(false, 1, 99);
    }

    public static void showFromTo(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    public static void sayMyName(int repeat) {
        for (int i = 1; i <= repeat; i++) {
            System.out.println("Cyril Personne");
        }
    }

    public static void showPairsFromTo(boolean pair, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (pair && i % 2 == 0) {
                 System.out.println(i);
            } else if (!pair && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

}