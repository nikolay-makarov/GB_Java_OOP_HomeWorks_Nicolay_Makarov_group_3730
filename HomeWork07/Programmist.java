package OOP.HomeWorks.HomeWork07;

import java.util.Random;

public class Programmist extends Employee implements Observer {

    private static Random random = new Random();

    public Programmist(String name, Profession profession) {
        super(name, profession);
        minSalary = 80000 + random.nextDouble() * 250000;
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, Profession vacancyProfession) {
        super.receiveOffer(nameCompany, salary, vacancyProfession);
    }
}
