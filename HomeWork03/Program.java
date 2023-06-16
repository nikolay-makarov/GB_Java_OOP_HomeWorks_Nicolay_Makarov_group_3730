package OOP.HomeWorks.HomeWork03;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();


    static Employee generateEmployee(){
        String[] names = new String[] { "Андрей", "Василий", "Петр", "Павел", "Алексей", "Сергей", "Ефим", "Константин", "Владимир", "Лев" };
        String[] surnames = new String[] { "Иванов", "Петров", "Сидоров", "Алексеев", "Артемов", "Барсов", "Багров", "Столяров", "Сергеев", "Семенов" };
        String[] educations = new String[] {"высшее", "неоконченное высшее", "среднее-специальное", "среднее"};
        int age = random.nextInt(48) + 18;
        int res = random.nextInt(2);
        if (res==0){
            int salary = random.nextInt(60000) + 20000;
            return new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary, age, educations[random.nextInt(educations.length)]);
        }
        else {
            return new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], 600, random.nextInt(11) + 1, random.nextInt(21) + 10, age, educations[random.nextInt(educations.length)]);
        }
        }

    public static void main(String[] args) {

        Employee[] employees = new Employee[20];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();
        }

        Arrays.sort(employees, new SalaryComparator());

        for(Employee employee : employees){
            System.out.println(employee);
        }
    }
}
