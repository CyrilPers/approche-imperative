package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        short[] myTab = {8, -7, 12, 1, -2, 14, 17, 9};
        System.out.println(myTab[0]);
        System.out.println(myTab.length);
        int lastIndex = (myTab.length) - 1;
        System.out.println(myTab[lastIndex]);
        System.out.println(myTab.length >10 ? myTab[10] : "Aucun élement à l'index 10");
    }
}
