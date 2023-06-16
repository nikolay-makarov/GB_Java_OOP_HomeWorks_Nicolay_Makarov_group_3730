package OOP.HomeWorks.HomeWork03;

public class Freelancer extends Employee{
    private int salaryPerHour;
    private int hours;
    private int days;

    public Freelancer(String surname, String name, int salaryPerHour, int hours, int days, int age, String education) {
        super(name, surname, salaryPerHour*days*hours, age, education);
        this.salaryPerHour = salaryPerHour;
        this.hours = hours;
        this.days = days;
    }

    @Override
    public int calculateSalary() {
        return this.salaryPerHour * this.hours * this.days;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; ЗП (ставка %d, часы %d, дни %d): %d (руб.); возраст: %d; %s образование",
                surname, name, salaryPerHour, hours, days, calculateSalary(), age, education);
    }
}
