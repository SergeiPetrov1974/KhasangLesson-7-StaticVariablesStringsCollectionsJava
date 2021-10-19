package io.khasang;

public class Cat {
    String name;
    static int count;
    int id;
    int consumed; // храним кол-во съеденной пищи

    void eatFrom(Plate plate) {
        int portion = plate.getPortion();  // int portion = получите из тарелки порцию еды (так чтобы и в тарелке еда тоже уменьшилась)
        consumed = plate.getPortion();    // увеличьте consumed на размер этой порции
        System.out.println("Кошка съела из тарелки " + portion);
        System.out.println("Кошка всего съела " + consumed);
    }


    public Cat(String name) {
        this();
        this.name = name;
    }

    public Cat() {
        count++;
        id = count;
    }

    public void showId() {
        System.out.println("Кот " + name + " имеет номер " + id);
    }


    public static void showCount() {
        System.out.println("Всего кошек " + count + " шт.");
    }
/*
    public static void showBowlAndPlate(String food, int amountFood, String water, int amountWater) {
        Bowl bowl = new Bowl(food, amountFood);
        //Plate plate = new Plate(water, amountWater);
        for (int i = 0; i < Cat.count; i++) {
            System.out.println("У Кошки " + (i + 1) + " есть миска с " + bowl.food + ", и тарелка с " + plate.liquid);
        }
    }

    public void show() {
        bowl.cat.plate.showFood();

    }

 */
}
