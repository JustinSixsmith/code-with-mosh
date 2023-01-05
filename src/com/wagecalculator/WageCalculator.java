package com.wagecalculator;

public class WageCalculator {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
