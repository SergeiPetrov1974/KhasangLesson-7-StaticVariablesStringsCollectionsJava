package io.khasang;

public class Plate {
    int amount = 100; // сколько еды в тарелке осталось
    int portion = 30; // размер порции

    void feed(Cat cat) {
        if (portion > amount){
            System.out.println("Порция превышает кол-во еды в тарелке.");
            return;
        }
        amount -= portion;
        if (amount <= portion) {             // уменьшите размер amount на размер порции (сделайте проверку, чтобы было нельзя съесть больше, чем в тарелке осталось)
            System.out.println("Тарелка пустая.");
            return;
        }
            portion += portion;
        if (amount <= portion) {
            return;
        }
            amount -= portion;        // увеличьте у кошки кол-во потребленной ей еды на размер этой порции
            System.out.println("Тарелка покормила кошку на " + portion);
            System.out.println("В тарелке осталось " + amount);
            System.out.println("Кошка всего съела " + cat.consumed);
    }

    int getPortion() {
        amount -= portion;     // уменьшите размер оставшейся в тарелке еды на размер порции
        // (сделайте проверку, чтобы было нельзя съесть больше, чем в тарелке осталось)
        // (если еды мало – то всю ее и съесть)
        System.out.println("В тарелке осталось " + amount);
        // верните потребленный размер порции с помощью return
        return 0;
    }
}
