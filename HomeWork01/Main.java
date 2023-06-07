package OOP.HomeWorks.HomeWork01;

public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.addProduct(new Product("Перец", 50));
        vm.addProduct(new Product("Петрушка", 33));
        vm.addProduct(new Drink("Сок березовый", 65, 0.9, TypesOfDrink.JUICE));
        vm.addProduct(new Chocolate("Шоколад \"Бабаевский\"", 110, 70));

        System.out.println(vm);
    }
}
