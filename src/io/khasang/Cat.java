package io.khasang;

public class Cat {
    private static int catCounter = 0;
    private static double sharedBowl = 100.0;
    private static double sharedPlate = 100.0;
    private int number;
    private double foodConsumed = 0;
    private double waterConsumed = 0;

    Cat() {
        catCounter++;
        number = catCounter;
    }

    public static double getSharedBowl() {
        return sharedBowl;
    }

    public static double getSharedPlate() {
        return sharedPlate;
    }

    public int getNumber() {
        return number;
    }

    public void eatStatic() {
        double temp = 10.0 + (Math.random() * 10);
        sharedBowl -= temp;
        foodConsumed += temp;
        System.out.println("Колличество съеденной еды = " + temp);
        System.out.println("Остаток еды в миске = " + sharedBowl);
    }

    public void drinkStatic() {
        double temp = 10.0 + (Math.random() * 10);
        sharedPlate -= temp;
        waterConsumed += temp;
        System.out.println("Колличество выпитой воды = " + temp);
        System.out.println("Остаток воды в тарелке = " + sharedPlate);
    }

    public void eat(Bowl bowl) {
        double temp = 10.0 + (Math.random() * 10);
        bowl.foodCount -= temp;
        foodConsumed += temp;
        System.out.println("Колличество съеденной еды = " + temp);
        System.out.println("Остаток еды = " + bowl.foodCount);
    }

    public void drink(Plate plate) {
        double temp = 10.0 + (Math.random() * 10);
        plate.waterCount -= temp;
        waterConsumed += temp;
        System.out.println("Колличество съеденной еды = " + temp);
        System.out.println("Остаток воды = " + plate.waterCount);
    }

    public void showAboutCat() {
        System.out.println("Номер кошки " + number);
        System.out.println("Общее количество потребляемой пищи = " + foodConsumed);
        System.out.println("Общее количество потребляемой воды = " + waterConsumed);
    }
}
