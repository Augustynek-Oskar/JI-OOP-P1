public class Manager extends BaseEmployee {
    int bonusSalary = 500;
    final int salary = 5000;

    public Manager(String name, String surname, int yearOfEmployment, int salary) {
        super(name, surname, yearOfEmployment, salary);
    }

    public int calculateMonthlySalary(){
        return this.salary;
    }
    public int totalSalary(){
        return this.salary + bonusSalary;
    }
    public int setBonusSalary(int bonusSalary){
        this.bonusSalary = bonusSalary;
        return bonusSalary;
    }
}
