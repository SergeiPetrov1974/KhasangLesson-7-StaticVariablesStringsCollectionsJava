package io.khasang;

/*
1. Сделайте класс Кошка так, чтобы у каждой кошки был индивидуальный номер по порядку,
который бы увеличивался для новой кошки каждый раз, когда создается новая кошка.
Для это используйте static и конструктор.

2. Пусть у всех кошек будет одна на всех миска и одна на всех тарелка.
В тарелке и миске храните кол-во оставшейся еды/воды.
Реализуйте двумя путями:
а) Через статические переменные внутри класса Кошка.
б) Через отдельный класс Миска (Bowl) и отдельный класс Тарелка (Plate), но уже
без использования static. Обратите внимание, что
в классе Миска не должно быть ни статических полей, ни статических методов.
Чтобы вы могли при желании создать сколько угодно общих тарелок.

3. Проверьте, что все работает
а) Из другого класса (например, Main) создайте несколько кошек и выведите их номер,
чтобы было видно, что нумерация кошек работает.
б) Встречается одна типичная ошибка, чтобы ее отловить (если она вдруг закралась к вам),
сделайте следующее: в конце проверочной программы снова выведите информацию по первой кошке,
так вы проверите, действительно ли у каждой кошки есть свой индивидуальный номер и он сохраняется
в ее полях класса.
в) Сделайте так, чтобы кошки пили и ели из тарелки и миски (статических).
Отобразите, сколько съела/выпила каждая кошка и сколько еды/воды
осталось в тарелке и миске.
г) Создайте экземпляры классов Тарелка и Миска.
д) Сделайте так, чтобы кошки пили и ели из этих экземпляров класса.
Отобразите, сколько съела/выпила каждая кошка и сколько еды/воды
осталось в тарелке и миске.
 */
public class Homework7_1 {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        System.out.println(cat1.getNumber());
        System.out.println(cat2.getNumber());
        System.out.println(cat3.getNumber());
        System.out.println(cat1.getNumber());

        System.out.println("количество еды в общей миске = " + Cat.getSharedBowl());
        System.out.println("количество воды на общей тарелке = " + Cat.getSharedPlate());
        System.out.println("=======================================");

        System.out.println("'Static' кошка 1 ест");
        cat1.eatStatic();
        System.out.println("'Static' кошка 1 пьет");
        cat1.drinkStatic();
        System.out.println("'Static' кошка 2 ест");
        cat2.eatStatic();
        System.out.println("'Static' кошка 2 пьет");
        cat2.drinkStatic();
        System.out.println("'Static' кошка 3 ест");
        cat3.eatStatic();
        System.out.println("'Static' кошка 3 пьет");
        cat3.drinkStatic();
        System.out.println("=======================================");

        cat1.showAboutCat();
        cat2.showAboutCat();
        cat3.showAboutCat();
        System.out.println("=======================================");

        Bowl bowl1 = new Bowl();
        Plate plate1 = new Plate();
        Bowl bowl2 = new Bowl();
        Plate plate2 = new Plate();
        Bowl bowl3 = new Bowl();
        Plate plate3 = new Plate();

        System.out.println("Кошка1 съела");
        cat1.eat(bowl1);
        System.out.println("Кошка1 выпила");
        cat1.drink(plate1);
        System.out.println("Кошка2 съела");
        cat2.eat(bowl2);
        System.out.println("Кошка2 выпила");
        cat2.drink(plate2);
        System.out.println("Кошка3 съела");
        cat3.eat(bowl3);
        System.out.println("Кошка3 выпила");
        cat3.drink(plate3);
        System.out.println("=======================================");

        cat1.showAboutCat();
        cat2.showAboutCat();
        cat3.showAboutCat();
    }
}
