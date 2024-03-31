package fr.boucles;

public class ExerciceTableauEntier {

    public static void main(String[] args) {
        int[] myTabNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(myTabNumbers[0]);
        System.out.println(myTabNumbers.length);
        int lastIndex = (myTabNumbers.length) -1;
        System.out.println(myTabNumbers[lastIndex]);
        myTabNumbers[4] = 8;
    }
}
