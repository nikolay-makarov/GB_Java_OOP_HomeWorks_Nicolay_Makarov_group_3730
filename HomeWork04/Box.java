package OOP.HomeWorks.HomeWork04;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Box<F extends Fruit> {
    private final ArrayList<F> contents;
    private static int id = 0;
    private final int identificator;

    public static int getId() {
        return id;
    }

    public int getIdentificator() {
        return identificator;
    }

    public Box(ArrayList<F> contents) {
        this.contents = contents;
        this.identificator = ++id;
    }

    public Box() {
        this(new ArrayList<>());
    }

    public float getBoxWeight() {
        if (contents.isEmpty())
            return 0;
        return contents.size() * contents.get(0).getWeight();
    }

    public boolean addFruit(F fruit) {
        if (isPossibleAddTo(fruit, this)) {
            if (!contents.contains(fruit)) {
                contents.add(fruit);
                System.out.printf("В box #%d: добавлен фрукт %s\n", this.getIdentificator(), fruit);
                return true;
            } else {
                System.out.printf("Box #%d: Попытка дважды добавить в коробку один и тот же фрукт -> %s.\n",
                        this.getIdentificator(), fruit);
                return false;
            }
        } else {
            System.out.printf("Box #%d: Нельзя добавить -> %s, т.к. в коробке уже есть %s.\n",
                    this.getIdentificator(), fruit, contents.get(0));
            return false;
        }
    }

    public F removeFruit() {
        if (!contents.isEmpty()) {
            F target = contents.remove(0);
            System.out.printf("Box #%d: Из коробки вытащили фрукт -> %s\n", this.getIdentificator(), target);
            return target;
        }
        String message = String.format("Box #%d: Коробка пуста.", this.getIdentificator());
        throw new NoSuchElementException(message);
    }

    public void moveTo(int count, Box<F> targetBox) {
        if (this.contents.isEmpty()) {
            System.out.printf("В box #%d нет фруктов для извлечения.\n", this.getIdentificator());
            return;
        }

        if (count > this.contents.size()) {
            count = this.contents.size();
            System.out.printf("-> Из box #%d можно извлечь не более %d фрукт%s.\n",
                    this.getIdentificator(), count, count == 1 ? "а" : "ов");
        }

        for (int i = 0; i < count; i++)
            if (isPossibleAddTo(this.contents.get(0), targetBox))
                targetBox.addFruit(this.removeFruit());
            else
                System.out.printf("Невозможно переместить %s в коробку #%d.\n",
                        this.contents.get(0), targetBox.getIdentificator());
    }

    private boolean isPossibleAddTo(F f, Box<F> o) {
        return o.contents.isEmpty() || o.contents.get(0).getClass().equals(f.getClass());
    }

    @Override
    public String toString() {
        return "Box #" + identificator +
                ": " + contents + "\n";
    }

    public boolean compare(Box<F> o) {
        System.out.printf("Коробки #%d и #%d ",
                this.getIdentificator(), o.getIdentificator());

        if (this.getBoxWeight() == o.getBoxWeight()) {
            System.out.println("имеют одинаковую массу (true).");
            return true;
        } else {
            System.out.println("различаются по массе (false).");
            return false;
        }
    }
}
