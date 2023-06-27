package OOP.HomeWorks.HomeWork07;

public class Program {
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        Company beegeek = new Company("BeeGeek", 70000, jobAgency);
        Company mailru = new Company("Mail.ru", 100000, jobAgency);
        Company avito = new Company("Avito", 120000, jobAgency);

        Student nikulin = new Student("Никулин", Profession.Tester);
        Programmist vitsyn = new Programmist("Вицын", Profession.Programmist);
        Programmist uglov = new Programmist("Углов", Profession.Analyst);

        jobAgency.registerObserver(nikulin);
        jobAgency.registerObserver(nikulin);
        jobAgency.registerObserver(uglov);
        jobAgency.registerObserver(vitsyn);

        for (int i = 0; i < 2; i++){
            beegeek.needEmployee();
            mailru.needEmployee();
            avito.needEmployee();
        }
    }
}
