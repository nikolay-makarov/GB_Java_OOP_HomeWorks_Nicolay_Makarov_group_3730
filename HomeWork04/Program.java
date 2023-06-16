package OOP.HomeWorks.HomeWork04;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        ArrayList<Fruit> fruits = new ArrayList<>(
            List.of(new Apple(), new Apple(), new Apple(),
                new Orange(), new Orange()));
        System.out.printf("\nСодержимое корзины: %s", fruits);

        ArrayList<Box<Fruit>> boxes = new ArrayList<>(
            List.of(new Box<>(), new Box<>(), new Box<>(), new Box<>(), new Box<>()));
        System.out.println("\n-> СОДЕРЖИМОЕ КОРОБОК:");
        for (Box<Fruit> box : boxes)
            System.out.printf("%s", box);
        System.out.println("--------------------");

        for (Box<Fruit> box : boxes) {
            if (fruits.isEmpty())
                break;

            fruits.removeIf(box::addFruit);
        }

        System.out.printf("\nСодержимое корзины: %s", fruits);
        System.out.println("\n-> Содержимое коробок:");
        for (Box<Fruit> box : boxes)
            System.out.printf("%s", box);
        System.out.println("--------------------");

        fruits.add(boxes.get(0).removeFruit());
        System.out.print(boxes.get(0));
        System.out.printf("Содержимое корзины: %s", fruits);
        System.out.println("\n--------------------");

        boxes.get(0).moveTo(5, boxes.get(3));
        boxes.get(0).moveTo(1, boxes.get(3));
        System.out.print(boxes.get(0));
        System.out.print(boxes.get(3));

        System.out.println();
        System.out.printf("Масса коробки #%d составляет %.1f кг.\n", boxes.get(0).getIdentificator(), boxes.get(0).getBoxWeight());
        System.out.printf("Масса коробки #%d составляет %.1f кг.\n", boxes.get(2).getIdentificator(), boxes.get(2).getBoxWeight());
        System.out.printf("Масса коробки #%d составляет %.1f кг.\n", boxes.get(3).getIdentificator(), boxes.get(3).getBoxWeight());
        boxes.get(0).compare(boxes.get(3));
        boxes.get(2).compare(boxes.get(3));

        System.out.printf("\nСодержимое корзины: %s", fruits);
        System.out.println("\n-> Содержимое коробок:");
        for (Box<Fruit> box : boxes)
            System.out.printf("%s", box);
        System.out.println("--------------------");

        boxes.get(1).moveTo(1, boxes.get(2));

        System.out.printf("\nСодержимое корзины: %s", fruits);
        System.out.println("\n-> Содержимое коробок:");
        for (Box<Fruit> box : boxes)
            System.out.printf("%s", box);
        System.out.println("--------------------");
    }
}
