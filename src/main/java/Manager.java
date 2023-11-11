public class Manager extends BaseEmployee {
    private int bonusSalary = 500;
    final int salary = 5000;

    public Manager(String name, String surname, int yearOfEmployment) {
        super(name, surname, yearOfEmployment);
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
