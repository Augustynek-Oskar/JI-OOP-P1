public class BaseEmployee {
    String name;
    String surname;
    int salary = 3000;
    final int yearOfEmployment;

    public BaseEmployee(String name, String surname, int yearOfEmployment, int salary){
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
    }
    public int calculateMonthlySalary(){
        return salary;
    }
    public int getYearsOfExperience(){
        return 2023 - yearOfEmployment;
    }
    public int totalSalary() {
        return this.salary;
    }

}

