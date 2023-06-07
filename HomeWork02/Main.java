package OOP.HomeWorks.HomeWork02;


public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Люси", 20),
            new Cat("Персик", 15),
            new Cat("Рикки", 12),
            new Cat("Васька", 12),
            new Cat("Бостон", 18),
    };

    Plate plate = new Plate(0);
        plate.feedCat(40);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.printf("Кот по кличке %s - сытость %s.\n", cat.getName(), cat.isFull());
        }
    }
}
