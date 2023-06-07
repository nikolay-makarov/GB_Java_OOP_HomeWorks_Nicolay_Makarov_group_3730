package OOP.HomeWorks.HomeWork02;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.printf("тарелка: %d\n", food);
    }

    public int getFood() {
        return 0;
    }

    public void setFood(Object object) {
    }

    public void feedCat(int amount) {
            this.food += amount;
            System.out.printf("Добавлено %d единиц корма в миску, теперь в миске %d единиц еды.\n", amount, food);
    }

    public boolean eatFood(int amount) {
        if (this.food < amount) {
                System.out.println("\nКорма в тарелке слишком мало, чтобы кот был сыт.");
                return false;
        }
        this.food -= amount;
        System.out.printf("\nИз миски удалено %d единиц корма, теперь в миске %d единиц еды.\n", amount, food);
        return true;
    }
}
