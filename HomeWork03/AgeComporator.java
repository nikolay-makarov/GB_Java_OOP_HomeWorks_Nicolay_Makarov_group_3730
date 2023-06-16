package OOP.HomeWorks.HomeWork03;

import java.util.Comparator;

public class AgeComporator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
