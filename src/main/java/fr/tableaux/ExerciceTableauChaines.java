package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] myCitiesTab = {"Montpellier", "Paris", "Lyon", "Nice", "Marseille" };
        showCities(myCitiesTab);
        System.out.println(myCitiesTab.length);
        myCitiesTab[3] = "Reims";
        showCities(myCitiesTab);
    }

    public static void showCities(String[] myCitiesTab) {
        for (String city : myCitiesTab) {
            System.out.println(city);
        }
    }
}
