package WageCalculator;

public class wageCalculator {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(-1);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
