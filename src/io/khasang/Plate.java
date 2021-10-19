package io.khasang;

public class Plate {
    String liquid;
    int amountWater;
    Cat cat;

    public Plate(Cat cat) {
        this.cat = cat;
    }

    public Plate(String liquid, int amountWater) {
        this.liquid = liquid;
        this.amountWater = amountWater;
    }

    public void showFood() {
        System.out.println("Тарелка покормила кошку на " );
        System.out.println("В тарелке осталось " );
        System.out.println("Кошка всего съела " + cat.name);
    }
}
