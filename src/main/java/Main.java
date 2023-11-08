public class Main {
    public static void main(String[] args) {

        BaseEmployee employee1 = new BaseEmployee("Oskar", "Augustynek",2020,1000);
        Manager manager = new Manager("Jan", "Kowalski", 2018,3000);
        TicketSeller ticketSeller = new TicketSeller("Adam", "Nowak", 2021, 3000);

        //zwróć kwotę podstawowego wynagrodzenia
        System.out.println(employee1.calculateMonthlySalary());
        System.out.println(manager.calculateMonthlySalary());
        System.out.println(ticketSeller.calculateMonthlySalary() + "\n");

        //zwróć informację ile lat pracownik pracuje w przedsiębiorstwie
        System.out.println(employee1.getYearsOfExperience());
        System.out.println(manager.getYearsOfExperience());
        System.out.println(ticketSeller.getYearsOfExperience() + "\n");

        //zwróć całkowite wynagrodzenie miesięczne każdego z pracowników
        System.out.println(employee1.totalSalary());
        System.out.println(manager.totalSalary());
        System.out.println(ticketSeller.totalSalary() + "\n");

        //Dodaj możliwość zmiany wysokości bonusu dla managera
        manager.setBonusSalary(550);
        System.out.println(manager.totalSalary());

    }
}
