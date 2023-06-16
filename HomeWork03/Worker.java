package OOP.HomeWorks.HomeWork03;

public class Worker extends Employee {


    public Worker(String surname, String name, int salary, int age, String education) {
        super(surname, name, salary, age, education);
    }


    @Override
    public int calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата: %d (руб.); возраст: %d; %s образование",
                surname, name, salary, age, education);
    }
}
