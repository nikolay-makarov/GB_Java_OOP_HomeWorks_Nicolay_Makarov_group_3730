package OOP.HomeWorks.HomeWork02;

public class Cat {
    private String name;
    private boolean fullness;
    private int appetite;

    public Cat(String name) {
        this.name = name;
        this.fullness = false;
}

public Cat(String name, int appetite) {
    this.name = name;
    this.appetite = appetite;
    this.fullness = false;
}

public void eat(Plate plate) {
    if (plate.eatFood(this.appetite)) {
            System.out.printf("%s поел сколько хотел (%d единиц).\n", this.name, this.appetite);
            this.fullness = true;
    }
    else
        System.out.printf("%s не поел, потому что еды мало.\n", this.name);
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFull() {
        return fullness;
    }
}
